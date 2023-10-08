package com.dev.ecommerce.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Cource {
    @Id
    private String ID;
    private String title;
    private String description;
    private String duration;

    @ManyToMany
            @JoinTable(name="kkeyCource",
                    joinColumns=@JoinColumn(name="courcec"),
                    inverseJoinColumns = @JoinColumn(name="studentc"))
    Set<Student> studentSet;

    public Cource() {
    }

    public Cource(String ID, String title, String description, String duration) {
        this.ID = ID;
        this.title = title;
        this.description = description;
        this.duration = duration;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
