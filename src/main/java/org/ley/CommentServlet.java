package org.ley;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.ley.hibernate.Comment;
import org.ley.hibernate.HibernateUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
//добавляет комментарии в бд и выдает их

public class CommentServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        String userName = request.getUserPrincipal().getName();
        String productId = request.getParameter("product_id");
        String text = request.getParameter("text");

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        log("begin transaction for comment by " + userName );

        Comment comment = new Comment(productId, userName, text);

        session.save(comment);
        session.getTransaction().commit();

        Locale locale = new Locale("ru");

        Object obj = request.getSession().getAttribute("locale");
        if (obj != null) {
            locale = (Locale) obj;
        }

        PrintWriter writer = response.getWriter();

        writer.write(getComments(session, locale, productId).toString());
        writer.close();
        session.close();
    }

    public static StringBuilder getComments(Session session, Locale locale, String productId) {
        StringBuilder result = new StringBuilder();

        Query query = session.createQuery("from Comment WHERE productID = :p");
        query.setParameter("p", productId);
        for (Object obj: query.list()) {
            Comment comment = (Comment) obj;

            result.append("<div class='comment'>");
            result.append(comment.getUserName()).append(": </br>").append(comment.getText());
            result.append("</br>");

            DateFormat dateFormatter = DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.DEFAULT, locale);

            result.append(dateFormatter.format(new Date(comment.getTime())));
            result.append("</div>");
            result.append("<br/>");

        }
        return result;
    }
}