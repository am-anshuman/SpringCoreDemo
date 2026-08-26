package org.aman.bean_scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        OrderService order = context.getBean(OrderService.class);
        OrderService order2 = context.getBean(OrderService.class);

        // Here above, the bean is not created multiple times

        // Bean Scopes:
        // 1. Singleton: the container creates a single instance of that bean (default) - Eager initialization
        // 2. Prototype: container returns a different bean everytime the bean is requested - Lazy initialization

        System.out.println(order == order2); // true for singleton, false for prototype
    }
}
