package org.aman.bean_lifecycle;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {

    public void pay() {
        System.out.println("Payment done");
    }
}
