package com.danielnagy.szakdolgozat.security;

import com.danielnagy.szakdolgozat.model.enums.UserRole;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.BeanIds;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final CustomUserDetailService customUserDetailService;

    public SecurityConfig(CustomUserDetailService customUserDetailService) {
        this.customUserDetailService = customUserDetailService;
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(customUserDetailService).passwordEncoder(passwordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.cors();
        http.csrf().disable();

        http.authorizeRequests()
                .antMatchers("/api/authentication/**").permitAll()
                .antMatchers(HttpMethod.GET, "/api/accessories").permitAll()
                .antMatchers("/api/accessories/**").hasRole(UserRole.ADMIN.name())
                .antMatchers(HttpMethod.GET, "/api/cameras").permitAll()
                .antMatchers("/api/cameras/**").hasRole(UserRole.ADMIN.name())
                .antMatchers(HttpMethod.GET, "/api/computers").permitAll()
                .antMatchers("/api/computers/**").hasRole(UserRole.ADMIN.name())
                .antMatchers(HttpMethod.GET, "/api/consoles").permitAll()
                .antMatchers("/api/consoles/**").hasRole(UserRole.ADMIN.name())
                .antMatchers(HttpMethod.GET, "/api/headphones").permitAll()
                .antMatchers("/api/headphones/**").hasRole(UserRole.ADMIN.name())
                .antMatchers(HttpMethod.GET, "/api/phones").permitAll()
                .antMatchers("/api/phones/**").hasRole(UserRole.ADMIN.name())
                .antMatchers(HttpMethod.GET, "/api/televisions").permitAll()
                .antMatchers("/api/televisions/**").hasRole(UserRole.ADMIN.name())

                .anyRequest().authenticated();
    }

    @Override
    @Bean(BeanIds.AUTHENTICATION_MANAGER)
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public WebMvcConfigurer corsConfigurer(){
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("*")
                        .allowedMethods("*");
            }
        };
    }
}
