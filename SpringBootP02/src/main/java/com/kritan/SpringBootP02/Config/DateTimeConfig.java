package com.kritan.SpringBootP02.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Configuration    // this annotation represents that this class is an configuration class
public class DateTimeConfig {
    @Bean
    public LocalDateTime getInstance(){// as we know LocalDateTime is a Java predefined class so we are transforming it into spring bean using Bean Annotation
        return LocalDateTime.now(); // way to return LocalDateTime class Object
    }
}
