package org.aman.bean_lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//        OrderService order =  context.getBean(OrderService.class);
//        order.placeOrder();
//
//        AppConfig appConfig = context.getBean(AppConfig.class);
//        appConfig.demo();

        CartService cartService = context.getBean(CartService.class);
        System.out.println(cartService.getValue(1));

        context.close();
    }
}
