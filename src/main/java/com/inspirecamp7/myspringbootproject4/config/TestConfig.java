package com.inspirecamp7.myspringbootproject4.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {
    @Bean
    public CustomVO customVO() {
        return CustomVO.builder() //CutomerVOBuilder
                .mode("테스트 mode")
                .rate(0.5)
                .build();
    }
}
