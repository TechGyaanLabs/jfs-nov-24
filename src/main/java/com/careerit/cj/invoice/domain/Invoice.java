package com.careerit.cj.invoice.domain;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Invoice {

        private String accNo;
        private String name;
        private String email;
        private List<InvoiceItems> invoiceItems;
        private double amount;
        private double totalDiscount;
        private double finalAmount;
}
