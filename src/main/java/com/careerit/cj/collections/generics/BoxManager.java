package com.careerit.cj.collections.generics;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Box<T>{
    private T item;

}
public class BoxManager {

    public static void main(String[] args) {

        Box<String> box = new Box<>();
        box.setItem("Krish");
        System.out.println(box.getItem());

        Box<Integer> box1 = new Box<>();
        box1.setItem(123);
        System.out.println(box1.getItem());

    }
}
