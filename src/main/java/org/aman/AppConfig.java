package org.aman;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.aman")
public class AppConfig {

    @Bean
    public User createUser() {
        return new User("Anshuman", 24);
    }
}
