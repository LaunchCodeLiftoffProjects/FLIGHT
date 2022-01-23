package org.example.models;

import java.util.Objects;

public class Recommendations {

    public Object Result;

    public Recommendations(Object result) {
        Result = result;
    }

    public Object getResult() {
        return Result;
    }

    public void setResult(Object result) {
        Result = result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Recommendations)) return false;
        Recommendations that = (Recommendations) o;
        return Objects.equals(Result, that.Result);
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
