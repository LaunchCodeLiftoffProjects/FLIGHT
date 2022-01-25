package org.example.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Smoothies extends AbstractEntity {

    //@OneToMany
    //@JoinColumn(name = "user_id")

    private String smoothieRecipe;

    public Smoothies(String smoothieRecipe) { this.smoothieRecipe=smoothieRecipe; }

    public Smoothies(){}

    public String getSmoothieRecipe() {
        return smoothieRecipe;
    }

    public void setSmoothieRecipe(String smoothieRecipe) {
        this.smoothieRecipe = smoothieRecipe;
    }
}
