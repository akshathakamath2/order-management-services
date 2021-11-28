package com.example.paymentservice.service;

import com.example.paymentservice.constants.OrderType;
import com.example.paymentservice.model.PaymentRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * Each payment request is processes based on the Order Type
 */
@Component
@Slf4j
public class ProcessPaymentService {


    public String execute(PaymentRequest paymentRequest) throws Exception {
        String result = null;
        if (paymentRequest.getOrderType() == OrderType.Book) {
            BookPaymentService bps = new BookPaymentService();
            result = bps.processPayment(paymentRequest);

        } else if (paymentRequest.getOrderType() == OrderType.Membership || paymentRequest.getOrderType() == OrderType.Upgrade) {
            MembershipPaymentService mps = new MembershipPaymentService();
            result = mps.processPayment(paymentRequest);

        } else if (paymentRequest.getOrderType() == OrderType.Physical) {
            PhysicalProductPaymentService pms = new PhysicalProductPaymentService();
            result = pms.processPayment(paymentRequest);

        } else if (paymentRequest.getOrderType() == OrderType.Learning) {
            LearningPaymentService lps = new LearningPaymentService();
            result = lps.processPayment(paymentRequest);
        }
        return result;
    }

}
