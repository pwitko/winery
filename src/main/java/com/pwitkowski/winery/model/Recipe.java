package com.pwitkowski.winery.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "RECIPE")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"},
        allowGetters = true)
public class Recipe {

    @Column(name = "dish_names")
    private String dishName;

    @Column(name = "preparation_times")
    private Integer preparationTime;

    @Column(name = "people_quantities")
    private Integer peopleQuantity;

    @Column(name = "to_do_descriptions")
    private String toDoDescription;

    @OneToMany(mappedBy = "recipe")
    private List<Ingredient> ingredientsList;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

//    @Column(nullable = false, updatable = false)
//    @Temporal(TemporalType.TIMESTAMP)
//    @CreatedDate
//    private Date createdAt;
//
//    @Column(nullable = false)
//    @Temporal(TemporalType.TIMESTAMP)
//    @LastModifiedDate
//    private Date updatedAt;
//

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

    public void setIngredientsList(List<Ingredient> ingredientsList) {
        this.ingredientsList = ingredientsList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


//    public Date getCreatedAt() {
//
//        return createdAt;
//    }
//
//    public void setCreatedAt(Date createdAt) {
//        this.createdAt = createdAt;
//    }
//
//    public Date getUpdatedAt() {
//        return updatedAt;
//    }
//
//    public void setUpdatedAt(Date updatedAt) {
//        this.updatedAt = updatedAt;
//    }

    public Recipe(String dishName, Integer preparationTime, Integer peopleQuantity, String toDoDescription) {
        this.dishName = dishName;
        this.preparationTime = preparationTime;
        this.peopleQuantity = peopleQuantity;
        this.toDoDescription = toDoDescription;
    }

    public Recipe() {
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "dishName='" + dishName + '\'' +
                ", preparationTime=" + preparationTime +
                ", peopleQuantity=" + peopleQuantity +
                ", toDoDescription='" + toDoDescription + '\'' +
                ", ingredientsList=" + ingredientsList +
                ", recipeId=" + id +
                '}';
    }
}
