package com.example.paymentservice.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Item {

    private String itemNumber;
    private String itemDescription;
    private int quantity;
}
