package com.example.paymentservice.model;

import com.example.paymentservice.constants.OrderType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * Model class to map request parameters
 */

@Getter
@Setter
@ToString
public class PaymentRequest {

    private String orderId;
    private OrderType orderType;
    private List<Item> orderDetails;
    private Customer customerDetails;
    private PaymentDetails paymentDetails;
}
