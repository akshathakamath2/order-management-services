package com.example.paymentservice.service;

import com.example.paymentservice.model.PaymentRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * To handle the orders for Books
 *
 * */

@Service
@Slf4j
public class BookPaymentService implements PaymentFactory {

    @Override
    public String processPayment(PaymentRequest paymentRequest) {
        sendReceiptToRoyalty(paymentRequest.getOrderId());
        log.info("PaymentFactory processed successfully for order type Book");
        return "PaymentFactory processed successfully for order type Book";
    }

    /**
     * Send a duplicate packing slip to the royalty department
     *
     * */
    private void sendReceiptToRoyalty(String orderId) {
        log.info("The receipt for the purchased book with order ID is" + orderId +"sent to the Royalty email" );
    }
}

