package com.careerit.cj.day14;


import java.util.Objects;

class Product extends Object{

    private String pid;
    private String pname;
    private double price;

    public Product(String pid, String pname, double price) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
    }

    @Override
    public String toString(){
        return "Product [pid="+pid+", pname="+pname+", price="+price+"]";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return  Objects.equals(pid, product.pid) && Objects.equals(pname, product.pname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pid, pname, price);
    }
}
public class ProductManager {

    public static void main(String[] args) {

        Product p1 = new Product("P1001", "Dell Laptop", 45000);
        Product p2 = new Product("P1001", "Dell Laptop", 45000);
        Product p3 = p1;

        System.out.println(p1 == p2);
        System.out.println(p1 == p3);
        System.out.println(p1.equals(p2));

    }
}
