package com.example.graphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.support.OpenEntityManagerInViewFilter;

import javax.servlet.Filter;

@SpringBootApplication
public class GraphqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(GraphqlApplication.class, args);
    }

    /*@Bean
    GraphQLSchema schema() {
        DataFetcher<String> test = env -> "response";
        DataFetcher<String> hello = env -> "hi";
        return GraphQLSchema.newSchema()
                .query(GraphQLObjectType.newObject()
                        .name("query")
                        .field(field -> field
                                .name("test")
                                .type(Scalars.GraphQLString)
                        )
                        .field(field -> field
                                .name("hello")
                                .type(Scalars.GraphQLString)
                        )
                        .build())
                .codeRegistry(GraphQLCodeRegistry.newCodeRegistry()
                        .dataFetcher(FieldCoordinates.coordinates("query", "test"), test)
                        .dataFetcher(FieldCoordinates.coordinates("query", "hello"), hello)
                        .build())
                .build();
    }*/

    /**
     * Register the {@link OpenEntityManagerInViewFilter} so that the
     * GraphQL-Servlet can handle lazy loads during execution.
     *
     * @return
     */
    /*@Bean
    public Filter OpenFilter() {
        return new OpenEntityManagerInViewFilter();  //do not use this is anti-pattern(OSIV)
    }*/
}
