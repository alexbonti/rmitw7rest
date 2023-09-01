/*package dev.rmit.w7rest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .csrf(csrf -> csrf.ignoringAntMatchers("/h2-console/**"))
                .authorizeRequests(auth -> auth
                        .antMatchers("/h2-console/**").permitAll()
                        .antMatchers("/api/products/**").permitAll()
                        .antMatchers("/api/products").permitAll()
                        .anyRequest().authenticated()
                )
                .headers(headers -> headers.frameOptions().sameOrigin())
                .build();
    }

}
*/ 