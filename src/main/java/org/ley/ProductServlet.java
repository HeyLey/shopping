package org.ley;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.hibernate.Session;
import org.ley.hibernate.HibernateUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;


public class ProductServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        Locale locale = new Locale("ru");

        Object obj = request.getSession().getAttribute("locale");
        if (obj != null) {
            locale = (Locale) obj;
        }

        Integer id = Integer.valueOf(request.getParameter("id"));;

        Map<String, Object> data = fillData(locale, id, request.isUserInRole("tomcat"));

        PrintWriter out = response.getWriter();
        Configuration cfg = new Configuration();

        cfg.setClassForTemplateLoading(ProductServlet.class, "templates");

        Template template = cfg.getTemplate("template.ftl", "UTF8");

        try {
            template.process(data, out);
        } catch (TemplateException e) {
            throw new ServletException(e);
        }
        out.close();
    }

    private Map<String, Object> fillData(Locale locale, int id, boolean logged) {
        // int defaultTab = Integer.valueOf(getInitParameter("default-tab"));
        int defaultTab = Integer.valueOf(getServletContext().getInitParameter("default-tab"));
        ResourceBundle myres = ResourceBundle.getBundle("messages", locale);

        Product product = ProductsProvider.getProduct(id);

        HashMap<String, Object> map = new HashMap();

        map.put("userLogged", logged);

        Session session = HibernateUtil.getSessionFactory().openSession();
        StringBuilder comments = CommentServlet.getComments(session, locale, String.valueOf(product.getId()));

        map.put("comments", comments);
        map.put("product_id", product.getId());
        map.put("product_name", product.getName());
        map.put("product_description", product.getDescription());
        map.put("product_price", product.getPriceString());
        map.put("product_image", product.getImg());
        map.put("product_image2", product.getImg_());
        map.put("product_color1", product.getColor(0));
        map.put("product_color2", product.getColor(1));
        map.put("product_color3", product.getColor(2));
        map.put("s1", product.getSize(0));
        map.put("s2", product.getSize(1));
        map.put("s3", product.getSize(2));
        map.put("long_description", product.getLongDescription().replaceAll("\n", "<br/>"));

        map.put("tab1_class", (defaultTab == 1) ? "class=\"current\"" : "");
        map.put("tab2_class", (defaultTab == 2) ? "class=\"current\"" : "");
        map.put("tab3_class", (defaultTab == 3) ? "class=\"current\"" : "");

        map.put("tab1_style", (defaultTab != 1) ? "style=\"display: none\"" : "");
        map.put("tab2_style", (defaultTab != 2) ? "style=\"display: none\"" : "");
        map.put("tab3_style", (defaultTab != 3) ? "style=\"display: none\"" : "");

        map.put("buy_button", myres.getString("BUY_BUTTON"));
        map.put("color", myres.getString("COLOR"));
        map.put("size", myres.getString("SIZE"));
        map.put("size_table", myres.getString("SIZE_TABLE"));


        return map;
    }
}