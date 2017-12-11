package org.ley;

import org.hibernate.Session;
import org.ley.bean.Basket;
import org.ley.bean.OrderPart;
import org.ley.hibernate.HibernateUtil;
import org.ley.hibernate.Purchase;
import org.ley.hibernate.UserOrder;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

//тэг для заказака с jsp страницы, добавлят в бд
public class BuyTag extends SimpleTagSupport {
    private String address;
    private String delivery;
    private String user;

    public void setAddress(String address) {
        this.address = address;
    }
    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }
    public void setUser(String user) {
        this.user = user;
    }


    public void doTag() throws JspException, IOException {
        Basket basket = (Basket) getJspContext().getAttribute("basket", PageContext.SESSION_SCOPE);

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        System.out.println("begin");

        List<Purchase> purchases = new ArrayList();

        for (OrderPart part : basket.getOrders()) {
            Purchase p = new Purchase(part.getProduct().getId(), part.getProduct().getPrice(), part.getNumber());
            session.save(p);
            purchases.add(p);
        }


        UserOrder order = new UserOrder(user, "true".equals(delivery), address);
        order.setPurchases(new HashSet(purchases));

        session.save(order);
        session.getTransaction().commit();
        System.out.println("commit");

        getJspContext().setAttribute("basket", null, PageContext.SESSION_SCOPE);
    }
}
