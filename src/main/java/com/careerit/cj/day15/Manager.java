package com.careerit.cj.day15;

class A{
    int a = 9;
    A(){
        super();
        System.out.println("A class object created");
    }
    public void m1() {
        System.out.println("M1 method called from A");
    }
}
class B extends  A{
    int a = 99;
    B(){
        super();
        System.out.println("B class object created");
    }
    public void m1() {
        System.out.println("M1 method called from B");
    }
}
class C extends  B{
    int a = 999;
    C(){
        super();
        System.out.println("C class object created");
    }
    public void m1() {
        System.out.println("M1 method called from C");
    }
}
class D{
    D(){
        super();
        System.out.println("D class object created");
    }
    public void m1() {
        System.out.println("M1 method called from D");
    }
}
public class Manager {

    public static void main(String[] args) {

        A obj = new C();
        obj.m1();
        System.out.println(obj.a);

    }
}
