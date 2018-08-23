package com.pwitkowski.winery.model;

import javax.persistence.*;

@Entity
@Table(name = "ingredients")
public class Ingredient {

    @Column(name = "ingredient_names")
    private String ingredientName;

    @Column(name = "ingredient_quantities")
    private Integer ingredietnQuantity;

    @Column(name = "ingredient_units")
    @Enumerated(EnumType.STRING)
    private IngredientUnit ingredientUnit;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "recipe_id", nullable = false)
    private Recipe recipe;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Ingredient(String ingredientName, Integer ingredietnQuantity, IngredientUnit ingredientUnit) {
        this.ingredientName = ingredientName;
        this.ingredietnQuantity = ingredietnQuantity;
        this.ingredientUnit = ingredientUnit;
    }

    public Ingredient() {
    }


    @Override
    public String toString() {
        return "Ingredient{" +
                "ingredientName='" + ingredientName + '\'' +
                ", ingredietnQuantity=" + ingredietnQuantity +
                ", ingredientUnit=" + ingredientUnit +
                ", ingredientId=" + id +
                '}';
    }
}
