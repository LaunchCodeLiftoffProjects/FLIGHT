package org.example.controllers;


import org.example.models.Smoothies;
import org.example.models.data.IngredientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("add")
public class SmoothieController {
    @Autowired
    private IngredientsRepository ingredientsRepository;

    @GetMapping("")
    public String displayAddRecipeForm(Model model) {
        model.addAttribute(new Smoothies());
        return "add";
    }

    @PostMapping("")
    public String addRecipeForm(@ModelAttribute @Valid Smoothies newSmoothies,
                                Errors errors, Model model) {
        if (errors.hasErrors()) {
            model.addAttribute("title","Add Recipe");
            return "add";
        }
        ingredientsRepository.save(newSmoothies);
        model.addAttribute("ingredients", ingredientsRepository.findAll());
        return "add";
    }
}
