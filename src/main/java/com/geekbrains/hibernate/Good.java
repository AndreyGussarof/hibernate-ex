package com.geekbrains.hibernate;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "goods")
public class Good {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "title")
    private String title;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


//(fetch = FetchType.LAZY)
    @ManyToMany
    @JoinTable(
            name = "clients_goods", // название таблицы
            joinColumns = @JoinColumn(name = "good_id"),  // то что связываем
            inverseJoinColumns = @JoinColumn(name = "client_id") // то на что связываем
    )
    private List<Client> clients;



 //   @ManyToOne
    // (fetch = FetchType.LAZY)
//    @OneToOne
//    @JoinColumn(name = "author_id")
//    private Author author_id;
//
//    public Author getAuthor_id() {
//        return author_id;
//    }
//
    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
//
//    public void setAuthor_id(Author author_id) {
//        this.author_id = author_id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//    public void setTitle(String title) {
//        this.title = title;
//    }

    @Override
    public String toString() {
        return "Book [" + id + " " + title + " " + author_id.toString() + "]";
    }

//    @Override
//    public String toString() {
//        return "Book [" + id + " " + title + " " + author_id.getName() + "]";
//    }
//    @Override
//    public String toString() {
//        return "Book [" + id + " " + title + " " + author_id.getName() + "]";
//    }
}