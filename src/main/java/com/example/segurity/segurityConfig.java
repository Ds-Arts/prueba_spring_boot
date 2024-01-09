package com.example.segurity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import lombok.RequiredArgsConstructor;
//indica que la clase es de configuracion 
@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class segurityConfig {
    /**
     * @param http
     * @return
     */
    @Bean
    //endpoint publicos y diferenciarlo de los protegidos
    public SecurityFilterChain segurityFilterchain(HttpSecurity http) throws Exception{

        http
        .csrf(csrf ->
            csrf 
            .disable())
        .authorizeHttpRequests(
            //los request con la ruta auth setan publicos pero cualquiero otro request pedita autentificacion
            authRequest -> authRequest
            .requestMatchers("/auth/**").permitAll()
            .anyRequest().authenticated()
            )
            .formLogin(form -> form
            .loginPage("/login")
            .permitAll());

            return http.build();

    }
}
