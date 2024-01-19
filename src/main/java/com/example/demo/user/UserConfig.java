package com.example.demo.user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
    @Bean
    CommandLineRunner commandLineRunner(UserRepository repository) {
        return args -> {
            User giwrgos = new User(4L,"giwrgos", 18, "giw@gmail");
            repository.save(giwrgos);
            User alex = new User(5L,"alex", 19, "alex@gmail");
            repository.save(alex);
        };
    }
}
