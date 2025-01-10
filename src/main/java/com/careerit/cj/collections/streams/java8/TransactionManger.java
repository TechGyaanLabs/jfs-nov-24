package com.careerit.cj.collections.streams.java8;

import java.util.List;

public class TransactionManger {

    public static void main(String[] args) {

        TraderService service = new TraderService();

        List<Transaction> year2011 = service.getTransactionsByYear(2011);
        System.out.println(year2011);

        List<String> cities = service.getTraderCities();
        System.out.println(cities);

        System.out.println(service.getAllTraderNames());
    }
}
