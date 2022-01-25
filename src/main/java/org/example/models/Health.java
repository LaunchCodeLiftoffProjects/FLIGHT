package org.example.models;


import java.util.Objects;

public class Health {

    public Object Result;

    public Health(Object Result) {
        super();
        this.Result = Result;
    }

    public Object getResult() {
        return Result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Health)) return false;
        Health health = (Health) o;
        return Objects.equals(Result, health.Result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Result);
    }

    @Override
    public String toString() {

        return "I ADDED THIS FOR: " + Result;
    }
    }



