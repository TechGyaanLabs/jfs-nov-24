package com.careerit.cj.invoice.service;

import com.careerit.cj.invoice.domain.Account;
import com.careerit.cj.invoice.domain.Invoice;
import com.careerit.cj.invoice.domain.InvoiceItems;
import com.careerit.cj.invoice.util.SeedDataUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GenerateInvoiceService {

     private final Map<String, Account> accountMap = SeedDataUtil.getAccountDetails();
     private final GenerateInvoiceItemsService service = new GenerateInvoiceItemsService();

     public List<Invoice> generateInvoices() {
         Map<String,List<InvoiceItems>> accountInvoiceItems = service.getInvoiceItems();
         List<Invoice> invoices = new ArrayList<>();
         accountInvoiceItems.forEach((accNo, invoiceItems) -> {
             Account accDetails = accountMap.get(accNo);
             if(accDetails!=null) {
                 Invoice invoice = createInvoice(accDetails, invoiceItems);
                 invoices.add(invoice);
             }
         });
         return invoices;
     }

    private static Invoice createInvoice(Account accDetails, List<InvoiceItems> invoiceItems) {
        Invoice invoice = new Invoice();
        invoice.setName(accDetails.getName());
        invoice.setEmail(accDetails.getEmail());
        invoice.setAccNo(accDetails.getAccNo());
        invoice.setInvoiceItems(invoiceItems);
        double totalAmount = invoiceItems.stream().mapToDouble(InvoiceItems::getAmount).sum();
        double discountAmount = invoiceItems.stream().mapToDouble(InvoiceItems::getDiscount).sum();
        double finalAmount = totalAmount - discountAmount;
        invoice.setAmount(totalAmount);
        invoice.setTotalDiscount(discountAmount);
        invoice.setFinalAmount(finalAmount);
        return invoice;
    }
}
