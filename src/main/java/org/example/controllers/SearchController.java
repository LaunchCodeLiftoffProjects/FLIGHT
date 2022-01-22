package org.example.controllers;


import com.google.gson.Gson;
import org.apache.coyote.http11.HttpOutputBuffer;
import org.example.models.Api;
import org.example.models.Search;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


    @Controller
    @RequestMapping("search")
    public class SearchController {

        @RequestMapping("")
        public String search(Model model) {
            model.addAttribute("title", "Taking Flight");
            model.addAttribute("name", "Guest");
            return "search";
        }


        public String concatSearchParameter(String userStr){
            String newString = "";
            if (userStr.contains(" ")) {
                newString = userStr.replace(" ", "%20");
            }
            return newString;
        }

        @PostMapping("results")
        public Object getApiResults(@ModelAttribute Search search, @ModelAttribute Api api, @RequestParam String searchString, Model model) throws Exception {

           URI url = new URI("https://api.edamam.com/api/recipes/v2?type=public&q="+concatSearchParameter(searchString)+"&app_id=98848355&app_key=a2eab94993145d573991625b087c0ac9");

           Api getRecipeInfo = new Api();
            Gson gson = new Gson();
            Search recipeApi = gson.fromJson(getRecipeInfo.getRecipeInfo(url), Search.class);

            model.addAttribute("results", recipeApi.getHits());

            return "results";
        }

    }
