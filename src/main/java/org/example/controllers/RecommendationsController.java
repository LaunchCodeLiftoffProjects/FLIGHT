package org.example.controllers;

import com.google.gson.Gson;
import org.example.models.Api;
import org.example.models.Health;
import org.example.models.Recommendations;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
        Api getHealthRecs = new Api();
        Gson gson3 = new Gson();
        String getHealthy = getHealthRecs.getRecipeInfo(recommend);
        Recommendations healthyLiving = gson3.fromJson(getHealthy, Recommendations.class);

        model.addAttribute("recs", healthyLiving);

        return "results";
    }

}
