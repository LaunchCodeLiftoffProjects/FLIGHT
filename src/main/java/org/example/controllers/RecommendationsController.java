package org.example.controllers;

import java.io.IOException;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import org.example.models.Api;
import org.example.models.Recommendations;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;


@Controller
@RequestMapping("recommendations")
public class RecommendationsController {

    @RequestMapping()
    public String search(Model model) {
        model.addAttribute("title", "The Fly-ght - no Goldblum");
        model.addAttribute("name", "Guest");
        return "recommendations";
    }

   /* public class RecTypeAdapter extends TypeAdapter<Recommendations> {
        @Override
        public Recommendations read(JsonReader reader) throws IOException {
            // the first token is the start object
            JsonToken token = reader.peek();
            String fieldName = null;
            Recommendations dataset = new Recommendations();
            if (token.equals(JsonToken.BEGIN_OBJECT)) {
                reader.beginObject();
                if (token.equals(JsonToken.NAME )){
                    reader.nextName();
                    reader.endObject();
                }
                }

            return dataset;
        }

        @Override
        public void write(JsonWriter out, Recommendations value) throws IOException {

        }

    }*/

    @PostMapping("results")
    public Object getHealthRecs(@ModelAttribute Recommendations rec, @ModelAttribute Api api, @RequestParam String userAge, Model model) throws Exception {

       URI recommend = new URI("https://health.gov/myhealthfinder/api/v3/myhealthfinder.json?age="+userAge+"&sex=male");
       String getInfo = Api.getApiInfo(recommend);
        Recommendations health = new Gson().fromJson(getInfo, Recommendations.class);
       /* Gson gsonbuild = new GsonBuilder()
                .registerTypeAdapter(Recommendations.class, new Recommendations.RecommendationsDeserializerFromJsonUsingObject()).create();
        Recommendations health = gsonbuild.fromJson(getInfo, Recommendations.class);*/
      /* Gson gsonOfGson = new GsonBuilder()
                .registerTypeAdapter(Recommendations.class, new RecTypeAdapter()).create();
        Recommendations health = gsonOfGson.fromJson(getInfo, Recommendations.class);*/
       /* Type changeType = new TypeToken<Recommendations>() {}.getType();
        Recommendations healthyLiving = new Gson().fromJson(getInfo, changeType);*/

            model.addAttribute("recs", health.getResult().getResources().getAll().getResource());

        return "results";
    }

}
