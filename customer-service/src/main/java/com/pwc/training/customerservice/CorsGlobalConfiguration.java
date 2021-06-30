package com.pwc.training.customerservice;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.CorsRegistry;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.config.WebFluxConfigurer;

@Configuration
@EnableWebFlux
public class CorsGlobalConfiguration implements WebFluxConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry corsRegistry) {
        corsRegistry.addMapping("/**")
//          .allowedOrigins("http://allowed-origin.com")
                .allowedOrigins("*")
                .allowedMethods("GET", "POST", "PUT", "OPTIONS")
                .maxAge(3600);
    }
}
