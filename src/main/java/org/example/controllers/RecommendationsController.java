package org.example.controllers;

import java.util.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.*;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.reflect.TypeToken;
import org.example.models.Api;
import org.example.models.Recommendations;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.lang.reflect.Type;
import java.net.URI;



@Controller
@RequestMapping("recommendations")
public class RecommendationsController {

    @RequestMapping("")
    public String search(Model model) {
        model.addAttribute("title", "The Flight - no Goldblum");
        model.addAttribute("name", "Guest");
        return "recommendations";
    }


    @PostMapping("results")
    public Object getHealthRecs(@ModelAttribute Recommendations rec, @ModelAttribute Api api, @RequestParam String userAge, Model model) throws Exception {

        URI recommend = new URI("https://health.gov/myhealthfinder/api/v3/myhealthfinder.json?age="+userAge+"&sex=male");
       String getInfo = Api.getApiInfo(recommend);
        GsonBuilder gsonBldr = new GsonBuilder();
        gsonBldr.setFieldNamingPolicy(FieldNamingPolicy.IDENTITY).
                registerTypeAdapter(Recommendations.class, new Recommendations.RecommendationsDeserializerFromJsonUsingObject());
        Recommendations targetObject = gsonBldr.create().fromJson(getInfo, Recommendations.class);

            model.addAttribute("recs", targetObject.getResult());

        return "results";
    }


}
