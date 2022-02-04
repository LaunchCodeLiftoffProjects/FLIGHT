package org.example.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Favorites")
public class Favorites {

    @Id
    @GeneratedValue
    private int id;

    private String favoriteSmoothie;

    public Favorites(int id, String favoriteSmoothie){
        this.id = id;
        this.favoriteSmoothie = favoriteSmoothie;
    }

    public Favorites(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFavoriteSmoothie(String favoriteSmoothie) {
        this.favoriteSmoothie = favoriteSmoothie;
    }

    public String getFavoriteSmoothie() {
        return favoriteSmoothie;
    }


}
