package org.example.controllers;


import com.google.gson.Gson;
import org.example.models.Api;
import org.example.models.ConcatSearchParameter;
import org.example.models.Search;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.net.URI;



    @Controller
    @RequestMapping("search")
    public class SearchController {

        @RequestMapping("")
        public String search(Model model) {
            model.addAttribute("title", "Taking Flight");
            model.addAttribute("name", "Guest");
            return "search";
        }

        @PostMapping("results")
        public Object getApiResults(@ModelAttribute Search search, @ModelAttribute Api api, @RequestParam String searchString, Model model) throws Exception {

            String credentials = "&app_id=98848355&app_key=a2eab94993145d573991625b087c0ac9";
           URI url = new URI("https://api.edamam.com/api/recipes/v2?type=public&q="+ConcatSearchParameter.concatSearchParameterApi(searchString)+credentials);
            Gson gson = new Gson();
            Search recipeApi = gson.fromJson(Api.getApiInfo(url), Search.class);

           model.addAttribute("results", recipeApi.getHits());
           model.addAttribute("desiredItem", searchString);

            return "results";
        }

    }
