package com.careerit.cj.collections.streams.java8;


import java.util.Comparator;
import java.util.List;

public class DishManager {
    public static void main(String[] args) {

        List<Dish> menu = Dish.menu;

        // Get low calorie dishes < 400

        List<String> lowCaloriesDishes =
                menu.stream()
                        .filter(dish -> dish.getCalories() < 400)
                        .sorted(Comparator.comparing(Dish::getCalories))
                        .map(Dish::getName)
                        .toList();
        System.out.println(lowCaloriesDishes);

    }
}
