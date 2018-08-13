package com.pwitkowski.winery.model;

import java.util.List;

public class Recipe {

private String dishName;
private Integer preparationTime;
private Integer peopleQuantity;
private String toDoDescription;
private List ingredientsList;

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public Integer getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(Integer preparationTime) {
        this.preparationTime = preparationTime;
    }

    public Integer getPeopleQuantity() {
        return peopleQuantity;
    }

    public void setPeopleQuantity(Integer peopleQuantity) {
        this.peopleQuantity = peopleQuantity;
    }

    public String getToDoDescription() {
        return toDoDescription;
    }

    public void setToDoDescription(String toDoDescription) {
        this.toDoDescription = toDoDescription;
    }

    public List getIngredientsList() {
        return ingredientsList;
    }

    public void setIngredientsList(List ingredientsList) {
        this.ingredientsList = ingredientsList;
    }

    public Recipe(String dishName, Integer preparationTime, Integer peopleQuantity, String toDoDescription, List ingredientsList) {
        this.dishName = dishName;
        this.preparationTime = preparationTime;
        this.peopleQuantity = peopleQuantity;
        this.toDoDescription = toDoDescription;
        this.ingredientsList = ingredientsList;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "dishName='" + dishName + '\'' +
                ", preparationTime=" + preparationTime +
                ", peopleQuantity=" + peopleQuantity +
                ", toDoDescription='" + toDoDescription + '\'' +
                ", ingredientsList=" + ingredientsList +
                '}';
    }
}
