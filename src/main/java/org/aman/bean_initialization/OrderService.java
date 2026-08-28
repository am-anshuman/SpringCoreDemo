package org.aman.bean_initialization;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Lazy // This is a Singleton class, but we made its initialization Lazy by adding the @Lazy annotation
public class OrderService {

    PaymentService paymentService;

    public OrderService(@Lazy PaymentService paymentService) { // Here Spring IOC puts a proxy of PaymentService while creating OrderService

        this.paymentService = paymentService;

        System.out.println("OrderService created");
    }

    public void placeOrder() {

        paymentService.pay(); // The proxy gets replaced with the actual PaymentService when its being used
        System.out.println("Order Placed");
    }
}
