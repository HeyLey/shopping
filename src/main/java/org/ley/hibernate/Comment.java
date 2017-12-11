package org.ley.hibernate;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "COMMENT", uniqueConstraints = {@UniqueConstraint(columnNames = "ID"),})
public class Comment implements Serializable {
    //обращение к таблицам
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "PRODUCT_ID")
    private String productID;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "COMMENT_TIME")
    private long time;

    //@Lob
    @Column(name = "COMMENT_TEXT",  length = 2000)
    private String text;

    public Comment() {
    }

    public Comment(String productID, String userName, String text) {
        this.productID = productID;
        this.userName = userName;
        this.time = new Date().getTime();
        this.text = text;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
