package com.careerit.cj.invoice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InvoiceItems {

    private ChargeType chargeType;
    private double price;
    private long quantity;
    private double discount;
    private double amount;
}
