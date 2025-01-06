package com.careerit.cj.collections.setex;

import java.util.HashSet;
import java.util.Set;

public class ProductManager {
    public static void main(String[] args) {

        Product p1 = new Product("Dell Laptop", 45000);
        Product p2 = new Product("HP Laptop", 35000);
        Product p3 = new Product("Macbook Pro", 145000);
        Product p4 = new Product("Dell Laptop", 45000);
        Product p5 = new Product("HP Laptop", 35000);

        Set<Product> products = new HashSet<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(p5);
        System.out.println(products.size());
    }
}
