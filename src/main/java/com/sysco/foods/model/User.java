package com.sysco.foods.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name ="user")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;

    @OneToMany(
            targetEntity = Cart.class,
            mappedBy = "user",
            fetch = FetchType.LAZY
    )
    private List<Cart> carts;




}
