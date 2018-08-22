package com.pwitkowski.winery.repository;

import com.pwitkowski.winery.model.Ingredient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IngredientRepository extends CrudRepository<Ingredient, Integer> {
List<Ingredient> findByRecipeId(Integer RecipeId);
}
