package org.aman.bean_lifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.aman.bean_lifecycle")
public class AppConfig {

    public void demo() {
        System.out.println("demo");
    }

//    @Bean(initMethod = "start", destroyMethod = "stop")
//    public CartService getCartBean() {
//        return new CartService();
//    }
}
