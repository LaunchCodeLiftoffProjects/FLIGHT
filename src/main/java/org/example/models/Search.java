package org.example.models;

import java.util.ArrayList;
import java.util.Objects;

public class Search {

    private int id;
    public ArrayList<Object> hits;

    public Search(ArrayList<Object> hits) {
        super();
        this.hits = hits;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Object> getHits() {
        return hits;
    }

    public void setHits(ArrayList<Object> hits) {
        this.hits = hits;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Search)) return false;
        Search search = (Search) o;
        return id == search.id && Objects.equals(hits, search.hits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, hits);
    }

    @Override
    public String toString() {
        return "I ADDED THIS FOR: " + hits;
    }
}
