package com.example.coachingsystem.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import java.util.function.Function;

@Configuration
public class SecurityConfig {

    @Bean
    public InMemoryUserDetailsManager create(){
        UserDetails user1 = getUserDetails("Mayank","Prajapati");
        UserDetails user2 =getUserDetails("Ramesh","Sharma");
      return new InMemoryUserDetailsManager(user1,user2);
    }



    private UserDetails getUserDetails(String username,String password) {
        Function<String, String> passwordEncoder=input-> passwordEncoder().encode(input);


        UserDetails user=  User.builder()
              .passwordEncoder(passwordEncoder)
                .username(username)
                .password(password)
                .roles("USER","ADMIN")
                .build();
        return user;
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder() ;
    }
    }
