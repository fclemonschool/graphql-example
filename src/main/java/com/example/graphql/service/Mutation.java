package com.example.graphql.service;

import com.example.graphql.model.Cafe;
import com.example.graphql.model.Coffee;
import com.example.graphql.repository.CafeRepository;
import com.example.graphql.repository.CoffeeRepository;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Mutation implements GraphQLMutationResolver {
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

    public Coffee addCoffee(String origin, String aroma, String name) {
        Coffee coffee = new Coffee(origin, aroma, name);
        coffeeRepository.save(coffee);
        return coffee;
    }

    public Cafe addCafe(String name, List<Long> coffeeList) {
        Cafe cafe = new Cafe(name, coffeeList);
        cafeRepository.save(cafe);
        return cafe;
    }

    public Boolean deleteCafe(Long id) {
        cafeRepository.deleteById(id);
        return true;
    }

    public Cafe updateCafe(Long id, String name, List<Long> coffeeList) {
        Cafe cafe = cafeRepository.findById(id).orElse(null);
        if (cafe != null) {
            cafe.setName(name);
            cafe.setCoffeeList(coffeeList);
            cafeRepository.save(cafe);
        }
        return cafe;
    }
}
