package org.example.controllers;

import com.google.gson.Gson;
import org.example.models.Api;
import org.example.models.Search;
import org.example.models.Trails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.net.URI;

@Controller
@RequestMapping("trails")
public class TrailsController {

    @RequestMapping("")
    public String search(Model model) {
        model.addAttribute("title", "Flying down the path");
        model.addAttribute("name", "Guest");
        return "trails";
    }

    @PostMapping("results")
    public String getHikingTrails(@ModelAttribute Trails trails, @ModelAttribute Api api, @RequestParam String zipCode, Model model) throws Exception {
        URI  hikingAlong = new URI("https://prescriptiontrails.org/api/filter/?zip="+zipCode+"&by=zip&offset=0&count=6");

        Api getHikingTrailInfo = new Api();
        Gson hiker = new Gson();
        String moveYourBody = getHikingTrailInfo.getApiInfo(hikingAlong);
        Trails happyTrail = hiker.fromJson(moveYourBody, Trails.class);

        model.addAttribute("trails", moveYourBody);

        return "results";
    }

}
