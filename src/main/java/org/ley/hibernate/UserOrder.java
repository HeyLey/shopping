package org.ley.hibernate;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;


@Entity
@Table(name = "USER_ORDER", uniqueConstraints = {@UniqueConstraint(columnNames = "ID"),})
public class UserOrder implements Serializable {
    //обращение к таблицам
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "DELIVERY")
    private boolean delivery;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "ORDER_TIME")
    private long time;

    @OneToMany(targetEntity=Purchase.class)
    @JoinColumn(name="PURCHASE_ID")
    private Set<Purchase> purchases;

    public UserOrder() {
    }

    public UserOrder(String userName, boolean delivery, String address) {
        this.userName = userName;
        this.delivery = delivery;
        this.address = address;

        setTime(new Date().getTime());
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public Set<Purchase> getPurchases() {
        return purchases;
    }

    public void setPurchases(Set<Purchase> purchases) {
        this.purchases = purchases;
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

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isDelivery() {
        return delivery;
    }

    public void setDelivery(boolean delivery) {
        this.delivery = delivery;
    }
}
