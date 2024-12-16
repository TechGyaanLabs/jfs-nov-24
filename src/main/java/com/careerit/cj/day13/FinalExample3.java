package com.careerit.cj.day13;

import java.util.Arrays;

class Product{
    private String name;
    private double price;
    private final String BRAND_NAME;

    public Product(String name, double price, String brandName) {
        this.name = name;
        this.price = price;
        this.BRAND_NAME = brandName;
    }


}
public class FinalExample3 {

    public final static void main(final String[] args) {
        System.out.println(Arrays.toString(args));
        args[0] = "Hello";
        System.out.println(Arrays.toString(args));


    }
}
