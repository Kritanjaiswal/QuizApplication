package com.kritan.SpringSecurityP02_Role_Base_Auth.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class webConfig {
    @Bean
    public SecurityFilterChain securityFilter(HttpSecurity httpsecurity) throws Exception {
        httpsecurity.authorizeHttpRequests(req->
                req.requestMatchers("/contact", "/update").permitAll()
                        .anyRequest().authenticated()
        ).formLogin(withDefaults())
                .httpBasic(withDefaults());
        return httpsecurity.build();
    }
}
