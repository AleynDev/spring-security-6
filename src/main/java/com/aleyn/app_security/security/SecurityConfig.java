package com.aleyn.app_security.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    // In spring 6 it is not necessary to put @Autowired for HttpSecurity,
    // because spring already injects it automatically

    // This is the default configuration of spring security
    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) {
        try {
            http.authorizeHttpRequests(auth ->
                    auth.requestMatchers("/loans", "/balance", "/account", "/cards")
                            .authenticated()
                            .anyRequest().permitAll())
                    .formLogin(Customizer.withDefaults())
                    .httpBasic(Customizer.withDefaults());
            return http.build();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}