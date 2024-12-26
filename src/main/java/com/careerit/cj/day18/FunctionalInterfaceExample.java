package com.careerit.cj.day18;

@FunctionalInterface
interface  I1{
    default void m1(){
        System.out.println("I1 m1 method");
    }
    void m2();
    private void m3(){
        System.out.println("I1 m3 method");
    }
}
public class FunctionalInterfaceExample {
}
