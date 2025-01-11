package com.careerit.cj.invoice;

import com.careerit.cj.invoice.domain.Invoice;
import com.careerit.cj.invoice.service.GenerateInvoiceService;

import java.util.List;

public class InvoiceManger {

    public static void main(String[] args) {

        GenerateInvoiceService generateInvoiceService = new GenerateInvoiceService();
        List<Invoice> invoices = generateInvoiceService.generateInvoices();
       invoices.forEach(ele->{
           System.out.println("\n");
           System.out.println("Customer name   :"+ele.getName());
           System.out.println("Email           : "+ele.getEmail());
           System.out.println("Account         : "+ele.getAccNo());
           System.out.println("Invoice Items");
           ele.getInvoiceItems().forEach(System.out::println);
           System.out.println("Invoice Amount  :"+ele.getAmount());
           System.out.println("Discount Amount :"+ele.getTotalDiscount());
           System.out.println("Final Amount    :"+ele.getFinalAmount());
           System.out.println("\n");
       });
    }
}
