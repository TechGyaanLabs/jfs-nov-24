package com.careerit.cj.day18;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
class Apple {
    private String color;
    private double weight;
}

interface Filter<T> {
    boolean test(T t);
}


class AppleService {

    List<Apple> apples = getApples();

    public List<Apple> filterApples(Filter<Apple> filter) {
        List<Apple> filteredApples = new ArrayList<>();
        for (Apple apple : apples) {
            if (filter.test(apple)) {
                filteredApples.add(apple);
            }
        }
        return filteredApples;
    }
    private List<Apple> getApples() {
        return List.of(
                new Apple("Red", 150),
                new Apple("Green", 120),
                new Apple("Red", 200),
                new Apple("Green", 100),
                new Apple("Red", 180),
                new Apple("Green", 150),
                new Apple("Pink", 150),
                new Apple("Red", 150),
                new Apple("Green", 100),
                new Apple("Red", 150),
                new Apple("Green", 120),
                new Apple("Red", 110)
        );
    }
}


public class UsageOfPredicateExample {

    public static void main(String[] args) {

        AppleService appleService = new AppleService();
        List<Apple> redApples = appleService.filterApples((apple) -> apple.getColor().equals("Red"));
        System.out.println("Total red apples : " + redApples.size());


        // Get all the red apple weight greater than 150
        List<Apple> redApplesWeightGreaterThan150 = appleService.filterApples((apple) -> apple.getColor().equals("Red") && apple.getWeight() > 150);
        System.out.println("Total red apples weight greater than 150 : " + redApplesWeightGreaterThan150.size());

        // Get read or green apple weight greater than 150
        Filter<Apple> redOrGreenApplesWeightGreaterThan150Filter = apple -> List.of("Red", "Green").contains(apple.getColor()) && apple.getWeight() > 150;
        List<Apple> redOrGreenApplesWeightGreaterThan150 = appleService.filterApples(redOrGreenApplesWeightGreaterThan150Filter);
        System.out.println("Total red or green apples weight greater than 150 : " + redOrGreenApplesWeightGreaterThan150.size());

        // Get apples of the given colors
        Filter<Apple> applesOfGivenColorsFilter = apple -> List.of("Red", "Green").contains(apple.getColor());
        List<Apple> applesOfGivenColors = appleService.filterApples(applesOfGivenColorsFilter);
        System.out.println("Total red or green apples : " + applesOfGivenColors.size());
    }
}
