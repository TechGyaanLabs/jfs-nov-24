package com.careerit.cj.invoice;

import java.util.List;

public class InvoiceManger {

    public static void main(String[] args) {

        InvoiceGeneratorService obj = new InvoiceGeneratorService();
        List<Invoice> invoices = obj.generateInvoices();
        for(Invoice invoice:invoices){
            // Print details of invoice
        }
    }
}
