package com.example.paymentservice.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PaymentDetails {

    private String paymentMode;
    private int cardDetails;
}
