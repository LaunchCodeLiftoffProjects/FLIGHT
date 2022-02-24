package org.example.models;


import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Favorites extends AbstractEntity {

    @ManyToMany
    @JoinColumn(name = "user_id")
    private final List<Smoothies> smoothies = new ArrayList<>();

    public Favorites() {}

    public List<Smoothies> getSmoothies() { return smoothies; }


}
