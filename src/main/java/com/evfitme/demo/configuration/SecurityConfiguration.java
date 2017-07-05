package com.evfitme.demo.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by ryanwatson on 7/1/17.
 */
@Configuration
@Profile("secure")
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/favicon*", "/", "", "/css/**", "/fonts/**", "/img/**", "/index.html" ).permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .permitAll();
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/css/**", "", "/", "/fonts/**", "/img/**", "/index.html");
    }

@Autowired
    public void configureInMemoryUsers(AuthenticationManagerBuilder auth) throws Exception {
    auth.inMemoryAuthentication()
            .withUser("Ryan").password("Watson").roles("ADMIN", "USER")
            .and()
            .withUser("Tommy").password("Bahama").roles("USER")
            .and()
            .withUser("DisabledUser").password("password").roles("USER").disabled(true)
            .and()
            .withUser("ExpiredUser").password("password").roles("USER").accountLocked(true);
    }
}
