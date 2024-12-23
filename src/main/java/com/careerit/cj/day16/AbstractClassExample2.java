package com.careerit.cj.day16;

abstract class A{
    A(){
        System.out.println("A");
    }
}
abstract class B extends A{
    B(){
        System.out.println("B");
    }
}
class C extends B{
    C(){
        System.out.println("C");
    }
}
public class AbstractClassExample2 {

    public static void main(String[] args) {
        A obj = new C();
    }
}
