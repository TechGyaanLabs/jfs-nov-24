package com.careerit.cj.collections.json;

import lombok.Data;

import java.util.List;

@Data
public class Invoice {
    private String invoiceNumber;
    private String invoiceDate;
    private String dueDate;
    private Seller seller;
    private Buyer buyer;
    private List<Item> items;
    private double subTotal;
    private Tax tax;
    private double totalAmount;
    private String currency;
    private String notes;

    @Data
    public static class Seller {
        private String name;
        private String address;
        private String contact;
        private String phone;
    }

    @Data
    public static class Buyer {
        private String name;
        private String address;
        private String contact;
        private String phone;
    }

    @Data
    public static class Item {
        private String description;
        private int quantity;
        private double unitPrice;
        private double totalPrice;
    }

    @Data
    public static class Tax {
        private int rate;
        private double amount;
    }
}
