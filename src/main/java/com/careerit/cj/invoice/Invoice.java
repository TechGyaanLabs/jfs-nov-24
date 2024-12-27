package com.careerit.cj.invoice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Invoice {

        private String accNo;
        private String name;
        private String email;
        private List<InvoiceItems> invoiceItems;
        private double amount;
        private double totalDiscount;
        private double finalAmount;
}
