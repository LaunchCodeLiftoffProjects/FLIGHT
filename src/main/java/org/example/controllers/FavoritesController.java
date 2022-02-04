package org.example.controllers;

import org.example.models.Favorites;

import org.example.models.User;
import org.example.models.data.UserRepository;
import org.example.service.FavoritesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.NoSuchElementException;

@Controller
@RequestMapping("favorites")
public class FavoritesController {
    @Autowired
    FavoritesService favoritesService;


   @GetMapping("")
    public String list(Model model) {

       // model.addAttribute("favorites", );


        return "favorites";
    }


    @PostMapping("")
    public String addFavoriteSmoothieToDatabase(Model model, @ModelAttribute("newFavorite") Favorites newFavorite,
                                                @RequestParam(value="favoriteSmoothieName", required=false) String favoriteSmoothieName){
          if(favoriteSmoothieName != null) {

              favoritesService.saveFavorite(newFavorite);

             model.addAttribute("favorites", favoritesService.listAllFavorites());
          }

        model.addAttribute("favorites", "Ooooops");

        return "favorites";
    }


/*
    @GetMapping("/{id}")
    public ResponseEntity<Favorites> get(@RequestParam Integer id) {
        try {
            Favorites favorites = favoritesService.getFavorites(id);
            return new ResponseEntity<Favorites>(favorites, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Favorites>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/")
    public void add(@RequestBody Favorites favorites) {
        favoritesService.saveFavorite(favorites);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Favorites favorites, @PathVariable Integer id) {
        try {
            Favorites existingFavorite = favoritesService.getFavorites(id);
            favorites.setId(id);
            favoritesService.saveFavorite(favorites);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {

        favoritesService.deleteUser(id);
    } */

}
