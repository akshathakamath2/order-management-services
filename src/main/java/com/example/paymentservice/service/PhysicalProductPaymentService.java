package com.example.paymentservice.service;

import com.example.paymentservice.model.PaymentRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * To handle the orders for Physical products
 */
@Service
@Slf4j
public class PhysicalProductPaymentService implements PaymentFactory {


    @Override
    public String processPayment(PaymentRequest paymentRequest) {
        generatePackingSlip();
        log.info("PaymentFactory processed successfully for order type Physical");
        return "PaymentFactory processed successfully for order type Physical";
    }

    private void generatePackingSlip() {
        /*To-do
        Generate packing slip logic goes here
         */
    }
}
