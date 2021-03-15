package com.example.graphql;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
@TestPropertySource(properties = { "spring.autoconfigure.exclude=graphql.kickstart.spring.web.boot.GraphQLWebsocketAutoConfiguration" })
class GraphqlApplicationTests {

    @Test
    void contextLoads() {
    }

}
