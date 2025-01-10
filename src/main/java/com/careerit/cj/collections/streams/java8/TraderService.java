package com.careerit.cj.collections.streams.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TraderService {


        public List<Transaction> getTransactions(){
            Trader raoul = new Trader("Raoul", "Cambridge");
            Trader mario = new Trader("Mario","Milan");
            Trader alan = new Trader("Alan","Cambridge");
            Trader brian = new Trader("Brian","Cambridge");

           return Arrays.asList(
                    new Transaction(brian, 2011, 300),
                    new Transaction(raoul, 2012, 1000),
                    new Transaction(raoul, 2011, 400),
                    new Transaction(mario, 2012, 710),
                    new Transaction(mario, 2012, 700),
                    new Transaction(alan, 2012, 950)
            );
        }

        // Query 1: Find all transactions from year 2011 and sort them by value (small to high)

        public List<Transaction> getTransactionsByYear(int year){
           return getTransactions()
                     .stream()
                     .filter(transaction -> transaction.getYear() == year)
                     .sorted(Comparator.comparing(Transaction::getValue))
                     .toList();
        }

      // Query 2: What are all the unique cities where the traders work?
        public List<String> getTraderCities(){
            return getTransactions().stream()
                    .map(t->t.getTrader().getCity())
                    .distinct()
                    .toList();

        }

        // Query 3: Find all traders from Cambridge and sort them by name.

    public List<String> getTraderNames(){
        return getTransactions().stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .map(Trader::getName)
                .sorted()
                .toList();
    }

    // Query 4: Return a string of all traders’ names sorted alphabetically.

    public String getAllTraderNames(){

            return getTransactions()
                    .stream()
                    .map(t->t.getTrader().getName())
                    .distinct()
                    .reduce("",String::concat);

    }

}
