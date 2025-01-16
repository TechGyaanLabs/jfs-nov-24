package com.careerit.cj.collections.generics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// <T extends ClassName>
// <T extends InterfaceName>
// <T extends Class & Interface>


class Calculator<T extends  Number>{  // T must be a subclass of Number

    public double add(T a, T b){
        return a.doubleValue() + b.doubleValue();
    }

}

public class BoundedTypesExample {

    public static <T extends Number & Comparable<T>> List<T> fromArrayToList(T[] a) {
            return Arrays.stream(a).collect(Collectors.toList());
    }

    public static void main(String[] args) {

        Calculator<Integer> calc1 = new Calculator<>();
        System.out.println(calc1.add(10,20));

        Calculator<Double> calc2 = new Calculator<>();
        System.out.println(calc2.add(20.5,35.25));

        Integer[] arr = {1,2,3,4,5};
        List<Integer> intList = fromArrayToList(arr);
        System.out.println(intList);

    }
}
