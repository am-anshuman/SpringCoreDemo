package org.aman;

import org.aman.payment.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component // marks this class so that its object(Bean) is going to be created by IOC container
public class OrderService {

//    @Autowired // field injection
    private final PaymentService paymentService;

    @Autowired // constructor injection - this is the recommended approach
    public OrderService(@Qualifier("up") PaymentService paymentService) {
        this.paymentService = paymentService;
    }

//    @Autowired // setter injection
//    public void setPaymentService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }

    public void placeOrder() {
        paymentService.pay();
        System.out.println("Order Placed");
    }
}
