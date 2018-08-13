package com.pwitkowski.winery;


import com.pwitkowski.winery.model.IngredientUnit;
import com.pwitkowski.winery.service.Service;

public class TestClass {
    public static void main(String[] args) {

        Service recipeService = new Service();
        recipeService.createAndAddIngredientToIngredientList("pomidor", 2, IngredientUnit.szt);
        recipeService.createAndAddIngredientToIngredientList("makaron", 300, IngredientUnit.g);
        recipeService.createAndAddIngredientToIngredientList("boczek", 700, IngredientUnit.g);
        recipeService.createAndAddIngredientToIngredientList("sól", 1, IngredientUnit.szczypta);
        recipeService.createRecipeAndAddToRecipeList("carbonara", 30, 4, "\n1. Ugotuj makaron. \n 2. Usmaz boczek. \n 3. Wymieszaj razem.\n");
        System.out.println(recipeService.recipeList.get(0));

    }
}
