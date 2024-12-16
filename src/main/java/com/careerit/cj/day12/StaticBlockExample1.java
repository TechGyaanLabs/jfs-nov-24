package com.careerit.cj.day12;

class Demo{
    static {
        System.out.println("Demo class static block called");
    }
    public void show() {
        System.out.println("Show method called");
    }
    static {
        System.out.println("Second static block called");
    }
}
public class StaticBlockExample1 {

    public static void main(String[] args) {
        System.out.println("Main method called");
        Demo obj = new Demo();
        obj.show();
        obj.show();
        obj.show();
    }
}
