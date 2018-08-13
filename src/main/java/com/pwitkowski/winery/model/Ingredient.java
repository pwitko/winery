package com.pwitkowski.winery.model;

public class Ingredient {

    private String ingredientName;
    private Integer ingredietnQuantity;
    private IngredientUnit ingredientUnit;

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }


    public IngredientUnit getIngredientUnit() {
        return ingredientUnit;
    }

    public void setIngredientUnit(IngredientUnit ingredientUnit) {
        this.ingredientUnit = ingredientUnit;
    }

    public Integer getIngredietnQuantity() {
        return ingredietnQuantity;
    }

    public void setIngredietnQuantity(Integer ingredietnQuantity) {
        this.ingredietnQuantity = ingredietnQuantity;
    }

    public Ingredient(String ingredientName, Integer ingredietnQuantity, IngredientUnit ingredientUnit) {
        this.ingredientName = ingredientName;
        this.ingredietnQuantity = ingredietnQuantity;
        this.ingredientUnit = ingredientUnit;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "ingredientName='" + ingredientName + '\'' +
                ", ingredietnQuantity=" + ingredietnQuantity +
                ", ingredientUnit=" + ingredientUnit +
                '}' +
                "\n" ;
    }
}
