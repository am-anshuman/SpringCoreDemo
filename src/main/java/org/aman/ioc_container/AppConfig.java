package org.aman.ioc_container;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // signifies that this is a configuration class
@ComponentScan("org.aman") // performs component scan in the specified package
public class AppConfig {

    @Bean
    public User createUser() {
        return new User("Anshuman", 24);
    }
}
