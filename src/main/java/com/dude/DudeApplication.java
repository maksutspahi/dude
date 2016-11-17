package com.dude;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;

@SpringBootApplication
public class DudeApplication {

    public static void main(String[] args) {
        SpringApplication.run(DudeApplication.class, args);
    }

    @Bean
    public ShaPasswordEncoder passwordEncoder() {
        return new ShaPasswordEncoder(512);
    }
}
