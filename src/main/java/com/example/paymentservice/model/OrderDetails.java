package com.example.paymentservice.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class OrderDetails {

    private List<Item> itemList;
}
