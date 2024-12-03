package com.careerit.cj.day7;

class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void showInfo() {
        System.out.println("Name : " + name + " Price : " + price);
    }
}

public class ArraysExample4 {

    public static void main(String[] args) {

        String[] names = {"Krish", "Manoj", "Charan", "Tanvi", "Rajesh", "Balu", "Bhavana", "John", "Arif"};

        for (String name : names) {
            System.out.println(name.toUpperCase());
        }

        char[] arr = {'H', 'e', 'l', 'l', 'o'};

        for (char ch : arr) {
            System.out.println(ch);
        }

        Product[] products = new Product[5];
        products[0] = new Product("iPhone14", 60000);
        products[1] = new Product("iPhone15", 65000);
        products[2] = new Product("iPhone16", 75000);
        products[3] = new Product("iPhone16 Pro", 85000);
        products[4] = new Product("iPhone16 Pro Max", 150000);

        for (Product ele : products) {
            ele.showInfo();
        }

    }
}
