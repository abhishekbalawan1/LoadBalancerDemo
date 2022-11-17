package com.example.Client.Configuration;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudConfiguration {

    @Bean
    public RouteLocator getwayRoutes(RouteLocatorBuilder builder){
        return builder.routes()
                .route(r->r.path("/address/**")
                .uri("http://localhost:8081/"))

                .route(r->r.path("/job/**")
                .uri("http://localhost:8082/"))
                .build();
    }
}
