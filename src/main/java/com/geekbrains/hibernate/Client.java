package com.geekbrains.hibernate;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;

    @ManyToMany
//    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    @JoinTable(
            name = "clients_goods",
            joinColumns = @JoinColumn(name = "clients_id"),
            inverseJoinColumns = @JoinColumn(name = "goods_id")
    )
    private List<Good> goods;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Good> getGoods() {
        return goods;
    }
    public void setGoods(List<Good> goods) {
        this.goods = goods;
    }
    public Client() {
    }
    @Override
    public String toString() {
        String allBooks = "";
        for (Good o : goods) {
            allBooks += o.getTitle() + " ";
        }
        return "Client [" + id + " " + name + " " + allBooks + "]";
    }
}