package org.example.service;

import javax.transaction.Transactional;
import org.example.models.Favorites;
import org.example.models.data.FavoritesRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class FavoritesService {

        @Autowired
        private FavoritesRespository favoritesRespository;
        public Iterable<Favorites> listAllFavorites() {
            return  favoritesRespository.findAll();
        }

        public Favorites saveFavorite(Favorites favorites) {
            return favoritesRespository.save(favorites);
        }

        public Favorites getFavorites(Integer id) {
            return favoritesRespository.findById(id).get();
        }

        public void deleteUser(Integer id) {
            favoritesRespository.deleteById(id);
        }
}
