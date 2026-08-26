package org.aman.ioc_container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        // Make an IOC container using Annotation-based configuration using the ruleset defined
        // in the provided Reflection class i.e. AppConfig.class
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // fetches the object/bean of the class as specified using Reflection
        OrderService orderService = context.getBean(OrderService.class);
        orderService.placeOrder();
    }
}