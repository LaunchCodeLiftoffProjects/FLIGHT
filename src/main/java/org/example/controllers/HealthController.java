package org.example.controllers;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import org.example.models.Api;
import org.example.models.Health;
import org.example.models.Recommendations;
import org.example.models.Search;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.lang.reflect.Type;
import java.net.URI;

@Controller
@RequestMapping("topics")
public class HealthController {

    @RequestMapping("")
    public String search(Model model) {
        model.addAttribute("title", "The Flight of my life ");
        model.addAttribute("name", "Guest");
        return "health";
    }



    @PostMapping("results")
    public Object getTopicResults(@ModelAttribute Health health, @ModelAttribute Api api, @RequestParam String searchTopic, Model model) throws Exception {

        URI topical = new URI("https://health.gov/myhealthfinder/api/v3/topicsearch.json?categoryId="+searchTopic);
        Gson gson2 = new Gson();
       // JsonObject json = new JsonObject();
        String stringAPI = Api.getApiInfo(topical);
        //Type object = new TypeToken<Health>(){}.getType();
        Health topicInfo = gson2.fromJson(stringAPI, Health.class);

        model.addAttribute("topics", topicInfo.getResult());

        return "results";
    }

}
