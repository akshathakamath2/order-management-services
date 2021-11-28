package com.example.paymentservice.service;

import com.example.paymentservice.model.PaymentRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * To handle the orders for Membership ( New/ Upgrade)
 *
 * */
@Service
@Slf4j
public class MembershipPaymentService implements PaymentFactory {


    @Override
    public String processPayment(PaymentRequest paymentRequest) {

        if(paymentRequest.getOrderType().equals("Membership")) {
        log.info("PaymentFactory processed successfully :New Membership");
        return "PaymentFactory processed successfully :New Membership";
    }
        else {
            log.info("PaymentFactory processed successfully :Upgrade Membership");
            return "PaymentFactory processed successfully :Upgrade Membership";
        }
        }

    /*To-do
    Verify if the payment is for new membership or for an upgrade
    Send emails accordingly to the user
     */

}
