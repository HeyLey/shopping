package org.ley.bean;


import java.util.ArrayList;
import java.util.List;

public class OrderBean {
    private String userName;
    private String address;
    private boolean delivery;
    private String time;
    private int id;
    private List<OrderPart> parts = new ArrayList();

    public OrderBean(int id, String userName, String address, boolean delivery, String time) {
        this.userName = userName;
        this.address = address;
        this.delivery = delivery;
        this.time = time;
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String shop) {
        this.address = address;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public List<OrderPart> getParts() {
        return parts;
    }

    public void setParts(List<OrderPart> parts) {
        this.parts = parts;
    }

    public boolean getDelivery() {
        return delivery;
    }

    public void setDelivery(boolean delivery) {
        this.delivery = delivery;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
