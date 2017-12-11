package org.ley;

import java.io.Serializable;

//товар

public class Product implements Serializable {
    private int id;
    private Gender gender;
    private Categories category;
    private String name;
    private String description;
    private String longDescription;
    private int price;
    private String img;
    private String img_;
    String[] colors = new String[3];
    String[] sizes = new String[0];

    public Product() {
    }

    public Product(int id, String name, String description, int price, String img, String img_) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.longDescription = "";
        this.price = price;
        this.img = img;
        this.img_ = img_;
    }

    public Product male(Categories category) {
        gender = Gender.FOR_MEN;
        this.category = category;
        return this;
    }

    public Product fermale(Categories category) {
        gender = Gender.FOR_WOMAN;
        this.category = category;
        return this;
    }

    public Product withCloseSize() {
        return withSizes("S", "M", "L");
    }

    public Product withShoeSize() {
        return withSizes("37", "38", "39");
    }

    public Product withSizes(String s1, String s2, String s3) {
        sizes = new String[3];
        sizes[0] = s1;
        sizes[1] = s2;
        sizes[2] = s3;
        return this;
    }

    public Product withColor(String c1, String c2, String c3) {
        colors = new String[3];
        colors[0] = c1;
        colors[1] = c2;
        colors[2] = c3;
        return this;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getPriceString() {
        return Integer.toString(price) + " руб." ;
    }

    public String getImg() {
        return img;
    }

    public String getImg_() {
        return img_;
    }

    public String getDescription() {
        return description;
    }

    //public String getDescription_() {
    //  return description_;
    //}

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public void setColor(int i) {
        this.colors[i] = colors[i];
    }

    public void setSize(int i) {
        this.sizes[i] = sizes[i];
    }

    public String getSize(int i) {
        return sizes[i];
    }

    public String getColor(int i) {
        return colors[i];
    }

    public Product withLongDescription(String text) {
        longDescription = text;
        return this;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public boolean fromCategory(Gender gender, Categories category) {
        if (gender != null && gender != this.gender) {
            return false;
        }
        if (category != null && category != this.category) {
            return false;
        }
        return true;
    }
}