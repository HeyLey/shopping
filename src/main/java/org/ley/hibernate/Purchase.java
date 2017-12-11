package org.ley.hibernate;

import javax.persistence.*;
import java.io.Serializable;

// конкретная покупка, в заказе несколько покупок
@Entity
@Table(name = "PURCHASE", uniqueConstraints = {@UniqueConstraint(columnNames = "ID"),})
public class Purchase implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "PRODUCT_ID")
    private int productId;

    @Column(name = "COLOR")
    private String color;

    @Column(name = "SZ")
    private String size;

    @Column(name = "PRICE")
    private double price;

    @Column(name = "NUMBER")
    private int number;

    public Purchase(int productId, double price, int number) {
        this.productId = productId;
        this.price = price;
        this.number = number;
    }

    public Purchase() {
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

