package com.pwitkowski.winery.service;

import com.pwitkowski.winery.model.Ingredient;
import com.pwitkowski.winery.model.IngredientUnit;
import com.pwitkowski.winery.model.Recipe;

import java.util.ArrayList;
import java.util.List;


public class Service {

    public List recipeList = new ArrayList();

    private List ingredientList = new ArrayList();

    public void createAndAddIngredientToIngredientList(String ingredientName, Integer ingredientQuantity, IngredientUnit ingredientUnit) {
        Ingredient ingredient = new Ingredient(ingredientName, ingredientQuantity, ingredientUnit);
        ingredientList.add(ingredient);
    }

    public void removeIngredientFromIngredientList(Ingredient ingredient) {
        ingredientList.remove(ingredient);
    }

    public void createRecipeAndAddToRecipeList(String dishName, Integer preparationTime, Integer peopleQuantity, String toDoDescription) {
        Recipe recipe = new Recipe(dishName, preparationTime, peopleQuantity, toDoDescription, ingredientList);
        recipeList.add(recipe);
    }


}
