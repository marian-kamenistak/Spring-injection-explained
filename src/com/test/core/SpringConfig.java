package com.test.core;

import com.google.common.collect.ImmutableSet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Set;


@Configuration
@ComponentScan("com.test")
public class SpringConfig {

    @Bean(name = "documentFormatSpringBean") // of singleton scope by default
    public static Set<String> createListOfPredefinedAnimal() {
        return ImmutableSet.of("XML", "JSON");
    }
}
