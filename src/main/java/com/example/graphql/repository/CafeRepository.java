package com.example.graphql.repository;

import com.example.graphql.model.Cafe;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface CafeRepository extends CrudRepository<Cafe, Long> {

    @NotNull
    @Override
    @Transactional(readOnly = true)
    @EntityGraph(attributePaths = "coffeeList")
    Iterable<Cafe> findAll();
}
