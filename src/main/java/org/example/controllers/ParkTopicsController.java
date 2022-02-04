package org.example.controllers;

import com.google.gson.Gson;
import org.example.models.Api;
import org.example.models.ConcatSearchParameter;
import org.example.models.ParkTopics;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.net.URI;

@Controller
@RequestMapping("parktopics")
public class ParkTopicsController {

    @RequestMapping("")
    public String search(Model model) {
        model.addAttribute("title", "Flying down the path");
        model.addAttribute("name", "Guest");
        return "parktopics/topicsearch";
    }

    @PostMapping("results")
    public String getHikingTrails(@ModelAttribute ParkTopics parkTopics, @ModelAttribute Api api, @RequestParam String topic, Model model) throws Exception {

        URI parkInfo = new URI("https://developer.nps.gov/api/v1/articles?q="+ConcatSearchParameter.concatSearchParameterApi(topic)+"&api_key=sr0wQuoZ9xpQUFdC1IWl7k3oKaYxweONJNJcw6b3");

        String moveYourBody = Api.getApiInfo(parkInfo);
        ParkTopics letsTalk = new Gson().fromJson(moveYourBody, ParkTopics.class);

        model.addAttribute("topics", letsTalk.getData());

        return "parktopics/results";
    }

}
