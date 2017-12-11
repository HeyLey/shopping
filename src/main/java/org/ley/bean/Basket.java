package org.ley.bean;

import org.ley.Product;
import org.ley.ProductsProvider;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<OrderPart> orders = new ArrayList();

    private int totalPrice = 0;

    private int lassFreeId = 0;

    public List<OrderPart> getOrders() {
        return orders;
    }

    public void addOrder(int id, String color, String size) {
        Product product = ProductsProvider.getProduct(id);
        if (product == null) {
            return;
        }
        for (OrderPart o : orders) {
            if (o.getProduct() == product && o.getColor().equals(color) && o.getSize().equals(size)) {
                o.setNumber(o.getNumber() + 1);
                return;
            }
        }
        orders.add(new OrderPart(lassFreeId++, product, 1, color, size));

        updatePrice();
    }

    private void updatePrice() {
        totalPrice = 0;
        for (OrderPart o : orders) {
            totalPrice += o.getProduct().getPrice() * o.getNumber();
        }
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void remove(int orderId) {
        for (OrderPart o : orders) {
            if (o.getId() == orderId) {
                orders.remove(o);
                updatePrice();
                return;
            }
        }
    }
}
