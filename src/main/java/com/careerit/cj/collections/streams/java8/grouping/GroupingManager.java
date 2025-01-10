package com.careerit.cj.collections.streams.java8.grouping;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;

public class GroupingManager {

    public static void main(String[] args) {


        List<Dish> menu = Dish.menu;
        Map<String,List<String>> dishTag = Dish.dishTags;

        Map<Dish.Type,List<Dish>> groupByType = groupByType(menu);
        System.out.println(groupByType);

        System.out.println(groupByDishTypeReturnWithCalories(menu));

    }

    private static Map<Dish.Type, List<Dish>> groupByType(List<Dish> menu) {

            return
                    menu.stream()
                            .collect(groupingBy(Dish::getType));


    }

    private static Map<Dish.Type, List<String>> groupDishNamesByType(List<Dish> menu) {
        return menu.stream()
                .collect(groupingBy(Dish::getType, mapping(Dish::getName, toList())));
    }

    private static Map<Dish.Type,List<DishWithCalories>> groupByDishTypeReturnWithCalories(List<Dish> menu){
        return
                menu
                        .stream()
                        .collect(
                                groupingBy(Dish::getType,
                                        mapping(ele->
                                                        new DishWithCalories(ele.getName(),ele.getCalories())
                        ,toList())));

    }

}
