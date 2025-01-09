package com.careerit.cj.collections.streams;

import com.careerit.cj.collections.json.JsonUtil;
import com.careerit.cj.iplstats.domain.Player;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample2 {

    public static void main(String[] args) {
        Stream<String> stream = Stream.empty();
        stream.forEach(System.out::println);

        List<String> list = null;
        Stream<String> stream1 = streamOf(list);
        stream1.forEach(System.out::println);

        Collection<String> collection = Arrays.asList("a", "b", "c");
        Stream<String> stream2 = collection.stream();

        stream2.forEach(System.out::println);

        List<Integer> list1 = List.of(1,2,3,4,5,6,7,8,9,10);

        Set<Integer> evenSet = list1.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toSet());

        System.out.println(evenSet);

        Stream<String> stream3 = Stream.of("Krish", "Manoj", "John", "Anil", "Suresh", "Rajesh", "Charan");

        // Filter the name which has length greater than 4
        // Convert the name to uppercase
        // Filter the name which ends with H
        // Collect the names to set

        Set<String> nameSet = stream3
                .filter(name ->name.length() > 4)
                .map(String::toUpperCase)
                .filter(name -> name.endsWith("H"))
                .collect(Collectors.toSet());


        List<Player> players = JsonUtil.readListData("/players.json", new TypeReference<List<Player>>() {});

        // Get all the players who are from India


        double indiaPlayerAmount = players.stream()
                .filter(player -> player.getCountry().equals("India"))
                .mapToDouble(Player::getPrice)
                .sum();
        double otherPlayerAmount = players.stream()
                .filter(player -> !player.getCountry().equals("India"))
                .mapToDouble(Player::getPrice)
                .sum();

        double totalAmount = players.stream()
                .mapToDouble(Player::getPrice)
                .sum();

        DoubleSummaryStatistics summaryStatistics = players.stream()
                        .mapToDouble(Player::getPrice)
                                .summaryStatistics();

        System.out.println("Total amount : "+indiaPlayerAmount);
        System.out.println("Total amount : "+otherPlayerAmount);
        System.out.println("Total amount : "+(indiaPlayerAmount + otherPlayerAmount));
        System.out.println("Total amount : "+totalAmount);

        System.out.println("Summary : "+summaryStatistics);


    }



    public static Stream<String> streamOf(List<String> list) {
        return (list == null || list.isEmpty()) ? Stream.empty() : list.stream();
    }
}
