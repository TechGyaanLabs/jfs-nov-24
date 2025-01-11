package com.careerit.cj.invoice.domain;

import com.careerit.cj.invoice.enums.ChargeType;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class InvoiceItems {

    private ChargeType chargeType;
    private double price;
    private long quantity;
    private double discount;
    private double amount;
}
