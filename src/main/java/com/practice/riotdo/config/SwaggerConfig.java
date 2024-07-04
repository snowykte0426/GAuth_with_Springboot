package com.practice.riotdo.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public GroupedOpenApi imgApi() {
        return GroupedOpenApi.builder()
                .group("imgs")
                .pathsToMatch("/list/**", "/img_upload/**") // "/img_upload/**" 경로를 추가합니다.
                .packagesToScan("com.practice.riotdo.controller") // 올바른 패키지 경로를 설정합니다.
                .build();
    }
}