package com.sample.app.graphql.query;

import org.springframework.stereotype.Component;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;


@Component
public class HelloQuery implements GraphQLQueryResolver {
    public String hello() {
        return "Hello World!";
    }

    public String greeting(String name) {
        return String.format("Hello, %s", name);
    }
}