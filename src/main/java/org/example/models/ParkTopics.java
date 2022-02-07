package org.example.models;


import java.util.ArrayList;
import java.util.Objects;

public class ParkTopics {

    public ArrayList<Object> data;

    public ParkTopics(ArrayList<Object> data){
        this.data = data;
    }

    public ParkTopics(){

    }

    public ArrayList<Object> getData() {
        return data;
    }

    public void setData(ArrayList<Object> data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ParkTopics)) return false;
        ParkTopics that = (ParkTopics) o;
        return Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    @Override
    public String toString() {
        return "I ADDED THIS FOR: " + data;
    }
}
