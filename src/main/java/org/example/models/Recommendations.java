package org.example.models;;

import com.google.gson.*;
import java.lang.reflect.Type;
import java.util.Objects;

public class Recommendations {

    public Object Result;


    public Recommendations(Object Result) {
         super();
        this.Result = Result;
    }

    public Recommendations() {

    }

    public Object getResult() {
        return Result;
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
    public static class RecommendationsDeserializerFromJsonUsingObject implements JsonDeserializer<Recommendations> {

        @Override
        public Recommendations deserialize
                (JsonElement jElement, Type Object, JsonDeserializationContext context)
                throws JsonParseException {
            JsonObject jObject = jElement.getAsJsonObject();
            return new Recommendations(jObject);
        }
    }

    @Override
    public String toString() {

        return "I ADDED THIS FOR: " + Result;
    }
}
