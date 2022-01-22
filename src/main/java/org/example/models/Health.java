package org.example.models;

import java.util.ArrayList;
import java.util.Objects;

public class Health {

    public Object Result;
    public Object Sections;

    public Health(Object Result, Object Sections) {
        super();
        this.Result = Result;
        this.Sections = Sections;
    }

    public Object getResult() {
        return Result;
    }

    public Object getSections() {
        return Sections;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Health)) return false;
        Health health = (Health) o;
        return Objects.equals(Result, health.Result) && Objects.equals(Sections, health.Sections);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Result, Sections);
    }

    @Override
    public String toString() {
        return "Health{" +
                "Result=" + Result +
                ", Sections=" + Sections +
                '}';
    }
}


