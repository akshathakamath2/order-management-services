package com.example.paymentservice.service;

import com.example.paymentservice.model.PaymentRequest;

public interface PaymentFactory {

    String processPayment(PaymentRequest paymentRequest);

}
