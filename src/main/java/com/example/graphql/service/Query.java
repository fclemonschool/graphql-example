package com.example.graphql.service;

import com.example.graphql.model.Cafe;
import com.example.graphql.model.Coffee;
import com.example.graphql.repository.CafeRepository;
import com.example.graphql.repository.CoffeeRepository;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Query implements GraphQLQueryResolver {

    private CoffeeRepository coffeeRepository;
    private CafeRepository cafeRepository;

    @Autowired
    public void setCafeRepository(CafeRepository cafeRepository) {
        this.cafeRepository = cafeRepository;
    }

    @Autowired
    public void setCoffeeRepository(CoffeeRepository coffeeRepository) {
        this.coffeeRepository = coffeeRepository;
    }

    public Iterable<Coffee> findAllCoffees() {
        return coffeeRepository.findAll();
    }

    public long countCoffees() {
        return coffeeRepository.count();
    }

    public Iterable<Cafe> findAllCafes() {
        return cafeRepository.findAll();
    }

    public long countCafes() {
        return cafeRepository.count();
    }
}
