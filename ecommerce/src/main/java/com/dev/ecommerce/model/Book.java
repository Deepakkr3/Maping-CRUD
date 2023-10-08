package com.dev.ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Book {
    @Id
    private String ID;

    private String title;
    private String author;
    private String description;
    private String price;
    @ManyToOne
    private Student student;

    public Book() {
    }

    public Book(String ID, String title, String author, String description, String price) {
        this.ID = ID;
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
