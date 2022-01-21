package org.example.controllers;


import org.example.models.data.IngredientsRepository;
import org.example.models.data.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static org.example.controllers.ListController.searchCriteria;

@Controller
@RequestMapping("search")
public class SearchController {

    @Autowired
    private IngredientsRepository ingredientsRepository;

    @RequestMapping("")
    public String search(Model model) {
        model.addAttribute("criteria", searchCriteria);
        return "search";
    }

    @PostMapping("results")
    public String searchResults(Model model, @RequestParam String ingredientSearch) {
        Iterable<>
    }
}
