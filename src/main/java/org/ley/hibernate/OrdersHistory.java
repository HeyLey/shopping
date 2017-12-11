package org.ley.hibernate;

import org.hibernate.Session;
import org.ley.Product;
import org.ley.ProductsProvider;
import org.ley.bean.OrderBean;
import org.ley.bean.OrderPart;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersHistory {
    public List<OrderBean> getOrders(String userId) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        List<OrderBean> result = new ArrayList();
        int j = 1;
        for (Object obj: session.createQuery("from UserOrder ").list()) {
            UserOrder order = (UserOrder) obj;

            String time = (new Date(order.getTime())).toString();
            int id = j++;
            OrderBean orderBean = new OrderBean(
                    id,
                    order.getUserName(),
                    order.getAddress(),
                    order.isDelivery(),
                    time);

            List<OrderPart> parts = orderBean.getParts();
            int i = 0;
            for (Purchase purchase : order.getPurchases()) {
                Product product = ProductsProvider.getProduct(purchase.getProductId());
                parts.add(new OrderPart(i++, product, purchase.getNumber(), purchase.getColor(), purchase.getSize()));
            }
            result.add(orderBean);
        }
        return result;
    }
}
