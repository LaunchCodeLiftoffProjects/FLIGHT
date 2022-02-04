package org.example.models;


import com.google.gson.*;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Objects;

public class Recommendations {

    @SerializedName("Result")
    @Expose
    private Result result;

    public Recommendations(Result result) {
        super();
        this.result = result;
    }

    public Recommendations() {}

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public Recommendations withResult(Result result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Recommendations.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("result");
        sb.append('=');
        sb.append(((this.result == null)?"<null>":this.result));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.result == null)? 0 :this.result.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Recommendations)) {
            return false;
        }
        Recommendations rhs = ((Recommendations) other);
        return ((this.result == rhs.result)||((this.result!= null)&&this.result.equals(rhs.result)));
    }


 /* public static class RecommendationsDeserializerFromJsonUsingObject implements JsonDeserializer<Recommendations> {
        @Override
        public Recommendations deserialize
                (JsonElement jElement, Type Object, JsonDeserializationContext context)
                throws JsonParseException {
            JsonObject jObject = jElement.getAsJsonObject();
            return new Recommendations(jObject);
        }
    }*/
}


