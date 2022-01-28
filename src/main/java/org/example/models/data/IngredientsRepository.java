package org.example.models.data;


import org.example.models.Smoothies;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientsRepository extends CrudRepository<Smoothies, Integer> {


}
