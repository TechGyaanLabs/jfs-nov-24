package com.careerit.cj.day17;

interface A{
    void m1();
}
class C{
    void m2(){
        System.out.println("M2 method");
    }
}

class B extends C implements A{
    public void m1(){
        System.out.println("M1 method");
    }
}
public class AbstractAndInterfaceExample {

    public static void main(String[] args) {

            B obj = new B();
            obj.m1();
            obj.m2();
    }
}
