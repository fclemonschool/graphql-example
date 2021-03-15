package com.example.graphql.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Coffee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String origin;
    private String aroma;
    private String name;

    public Coffee(String origin, String aroma, String name) {
        this.origin = origin;
        this.aroma = aroma;
        this.name = name;
    }

    public Coffee(Long id) {
        this.id = id;
    }
}
