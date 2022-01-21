package org.example.controllers;

import org.example.models.data.IngredientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

@Controller
@RequestMapping(value = "list")
public class ListController {

    @Autowired
    private IngredientsRepository ingredientsRepository;

    static HashMap<String, String> searchCriteria = new HashMap<>();

    public ListController() {

        searchCriteria.put("ingredients", "Ingredients");
    }

    @RequestMapping("")
    public String list(Model model) {
        model.addAttribute("ingredients", ingredientsRepository.findAll());
        return "list";
    }
}
