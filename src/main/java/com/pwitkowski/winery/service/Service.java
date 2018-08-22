package com.pwitkowski.winery.service;

import com.pwitkowski.winery.model.Ingredient;
import com.pwitkowski.winery.model.IngredientUnit;
import com.pwitkowski.winery.model.Recipe;
import com.pwitkowski.winery.repository.IngredientRepository;
import com.pwitkowski.winery.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;


@org.springframework.stereotype.Service
public class Service implements RecipeService {

    @Autowired
    private RecipeRepository recipeRepository;

    @Autowired
    private IngredientRepository ingredientRepository;

    @Override
    public void createAndAddIngredientToIngredientList(String ingredientName, Integer ingredientQuantity, IngredientUnit ingredientUnit) {
        Ingredient ingredient = new Ingredient(ingredientName, ingredientQuantity, ingredientUnit);
        ingredientRepository.save(ingredient);
    }

    @Override
    public void createRecipeAndAddToRecipeList(String dishName, Integer preparationTime, Integer peopleQuantity, String toDoDescription, Integer id) {
        Recipe recipe = new Recipe(dishName, preparationTime, peopleQuantity, toDoDescription);
        recipeRepository.save(recipe);
    }

    @Override
    public List<String> getAllRecipeIngredients(Integer recipeId) {
        List<String> result = new ArrayList<>();
        List<Ingredient> ingredients = ingredientRepository.findByRecipeId(recipeId);
        for (Ingredient ingredient : ingredients) {
            result.add(ingredient.toString());
        }
        return result;
    }


}
