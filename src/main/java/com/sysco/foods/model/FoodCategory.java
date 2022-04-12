package com.sysco.foods.model;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "food_category")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "name")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class FoodCategory {

    @Id
    private String name;

    @OneToMany(
            targetEntity = Food.class,
            mappedBy = "category",
            fetch = FetchType.LAZY
    )
    private List<Food> foods;

    @JsonManagedReference
    public List<Food> getFoods() {
        return foods;
    }
}
