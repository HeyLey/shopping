package org.ley.bean;


import org.ley.Product;

public class OrderPart {
    private int id;
    private Product product;
    private String color;
    private String size;
    private int number;


    public OrderPart(int id, Product product, int number, String color, String size) {
        this.id = id;
        this.product = product;
        this.number = number;
        this.color = color;
        this.size = size;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

