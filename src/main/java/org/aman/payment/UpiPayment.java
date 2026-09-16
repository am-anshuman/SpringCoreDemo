package org.aman.payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier("upiPay")
public class UpiPayment implements PaymentService {

    @Override
    public void pay() {
        System.out.println("UPI Payment Done");
    }
}
