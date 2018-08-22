package com.pwitkowski.winery.repository;

import com.pwitkowski.winery.model.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RecipeRepository extends CrudRepository<Recipe, Integer> {
    Optional<Recipe> findById(Integer RecipeId);
}
