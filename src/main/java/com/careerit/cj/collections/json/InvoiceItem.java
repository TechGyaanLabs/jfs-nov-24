package com.careerit.cj.collections.json;

import lombok.Data;

@Data
public class InvoiceItem {
    private String description;
    private int quantity;
    private double unitPrice;
    private double totalPrice;
}
