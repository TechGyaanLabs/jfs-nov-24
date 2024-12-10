package com.careerit.cj.day9;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StringBuilderExample1 {


    public static void main(String[] args) {

        Invoice invoice1 = new Invoice("INV-1001", "Krish", 1000, "2024-01-10", LocalDate.of(2023, 12, 1), LocalDate.of(2023, 12, 31));
        Invoice invoice2 = new Invoice("INV-1002", "Manoj", 2000, "2024-01-10", LocalDate.of(2023, 12, 1), LocalDate.of(2023, 12, 31));
        Invoice invoice3 = new Invoice("INV-1003", "Charan", 3000, "2024-01-10", LocalDate.of(2023, 12, 1), LocalDate.of(2023, 12, 31));
        Invoice invoice4 = new Invoice("INV-1004", "Ravi", 4000, "2024-01-10", LocalDate.of(2023, 12, 1), LocalDate.of(2023, 12, 31));
        Invoice invoice5 = new Invoice("INV-1005", "Sai", 5000, "2024-01-10", LocalDate.of(2023, 12, 1), LocalDate.of(2023, 12, 31));


        // Hello Krish,

           // The invoice number INV-1001 (fromDate - toDate) is generated for the amount of 1000.0 and the due date is 2024-01-10

        // Thank you

        List<Invoice> invoiceList = new ArrayList<>();
        invoiceList.add(invoice1);
        invoiceList.add(invoice2);
        invoiceList.add(invoice3);
        invoiceList.add(invoice4);
        invoiceList.add(invoice5);

        for(Invoice invoice:invoiceList){
            StringBuilder sb = new StringBuilder();
            sb.append("Hello ").append(invoice.getName()).append(",\n")
                    .append("\tThe invoice number ").append(invoice.getNumber()).append(" (")
                    .append(invoice.getFromDate()).append(" - ").append(invoice.getToDate()).append(") is generated for the amount of ")
                    .append(invoice.getAmount()).append(" and the due date is ").append(invoice.getDueDate()).append("\n")
                    .append("Thank you");
            sentEmail(sb.toString());
            System.out.println("-------------------------------------------------");
        }


    }

    public static void sentEmail(String body){
        System.out.println(body);
    }

}
