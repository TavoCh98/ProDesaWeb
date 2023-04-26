package com.PruebaProyecto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    
    @Autowired
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("Admin1")
                .password("{noop}12345678")
                .roles("Administrador")
                .and()
                .withUser("Admin2")
                .password("{noop}123")
                .roles("Administrador")
                .and()
                .withUser("Admin3")
                .password("{noop}123")
                .roles("Administrador");
    }
}
