package org.example.controllers;

import org.example.models.Smoothies;
import org.example.models.User;
import org.example.models.data.FavoritesRepository;
import org.example.models.data.IngredientsRepository;
import org.example.models.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("favorites")
public class FavoritesController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private IngredientsRepository ingredientsRepository;

    /*@GetMapping("")
    public String favorites(Model model, User user, Smoothies smoothies, @PathVariable int userId) {
        model.addAttribute("favorites", "Favorites");
        Optional ingredients = ingredientsRepository.findById(userId);
        if (ingredients.isPresent()) {
        Smoothies
        }
        return "favorites";
    }*/

    @GetMapping("")
    public String favorites (Model model) {
        model.addAttribute("recipes", ingredientsRepository.findAll());
        return "favorites";
    }

    @GetMapping("add")
    public String displayAddFavorites (Model model) {
        model.addAttribute(new Smoothies());
        return "displayAdd";
    }

    @PostMapping("add")
    public String addFavorite(User user, Smoothies smoothies, Model model) {
        model.addAttribute("add favorite", "Add Favorite");
        user.getFavorites().add(smoothies);
        return "addFavorite";
    }

    @PostMapping("remove")
    public String removeFavorite(User user, Smoothies smoothies, Model model) {
        model.addAttribute("remove favorite", "Remove Favorite");
        user.getFavorites().remove(smoothies);
        return "removeFavorite";
    }

}
