package com.example.paymentservice.controller;

import com.example.paymentservice.model.PaymentRequest;
import com.example.paymentservice.service.ProcessPaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Rest Controller class
 */

@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private ProcessPaymentService processPaymentService;

    /**
     * Process payment request
     *
     * @param request
     * @return
     * @throws Exception
     */
    @PostMapping("/payment")
    public String processPayment(
            @RequestBody PaymentRequest request) throws Exception {
            log.info("PaymentFactory Request :" + request.toString());
            String response = processPaymentService.execute(request);
        return response;
    }
}
