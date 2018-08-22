package com.pwitkowski.winery.service;

import com.pwitkowski.winery.model.IngredientUnit;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RecipeService {
    void createAndAddIngredientToIngredientList(String ingredientName, Integer ingredientQuantity, IngredientUnit ingredientUnit);

    void createRecipeAndAddToRecipeList(String dishName, Integer preparationTime, Integer peopleQuantity, String toDoDescription, Integer id);

    List<String> getAllRecipeIngredients(Integer id);
}
