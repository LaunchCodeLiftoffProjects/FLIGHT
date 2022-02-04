package org.example.models.data;

import org.example.models.Favorites;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavoritesRespository extends JpaRepository<Favorites, Integer> {

}
