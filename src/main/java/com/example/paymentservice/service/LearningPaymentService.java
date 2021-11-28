package com.example.paymentservice.service;

import com.example.paymentservice.model.PaymentRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * To handle the orders for Videos
 */
@Service
@Slf4j
public class LearningPaymentService implements PaymentFactory {


    @Override
    public String processPayment(PaymentRequest paymentRequest) {
        processFirstAid();
        log.info("PaymentFactory processed successfully for order type Learning material");
        return "PaymentFactory processed successfully for order type Learning material";
    }


    /*To-do
    Validate the type of video from the request
     */


    /**
     * Add the first aid kit to the pack on selection of 'Learning to Ski' video
     */

    private void processFirstAid() {
        log.info(" Add the first aid learning video as per the court decision in 1997 ");
    }
}
