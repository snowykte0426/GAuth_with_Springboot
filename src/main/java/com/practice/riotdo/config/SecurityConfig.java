package com.practice.riotdo.config;

import com.practice.riotdo.entity.GAuth;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GAuthConfig {
    @Bean
    public GAuth gauth() {
        return new GAuthImpl();
    }
}