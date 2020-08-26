package com.geekbrains.hibernate;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "authors")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

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

    //    @Basic(fetch = FetchType.LAZY)
//    @OneToMany(mappedBy = "author_id")
//    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
//    private List<Book> books;

    @OneToMany(mappedBy = "author_id")
    private List<Good> goods;
//

    public List<Good> getGoods() {
        return goods;
    }

    public void setGoods(List<Good> goods) {
        this.goods = goods;
    }


//    public void setBooks(List<Book> books) {
//        this.books = books;
//    }
//
//    public List<Book> getBooks() {
//        return books;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//    public Author() {
//    }
//
    @Override
    public String toString() {
        String allBooks = "";
        for (Good o : goods) {
            allBooks += o.getTitle() + " ";
        }
        return "Author [" + id + " " + name + " " + allBooks + "]";
       // return "Author [" + id + " " + name + "]";
    }

//        @Override
//    public String toString() {
//        return "Author [" + id + " " + name + " " + book.toString() + "]";
//    }

//    @Override
//    public String toString() {
//        return "Author [" + id + " " + name + "]";
//    }
}