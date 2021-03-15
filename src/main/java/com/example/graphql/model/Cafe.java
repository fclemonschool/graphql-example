package com.example.graphql.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Cafe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @ElementCollection
    private List<Long> coffeeList;

    public Cafe(String name, List<Long> coffeeList) {
        this.name = name;
        this.coffeeList = coffeeList;
    }
}
