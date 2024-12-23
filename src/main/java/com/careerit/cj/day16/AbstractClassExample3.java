package com.careerit.cj.day16;

abstract class A1{
    abstract void m1();
    void m2(){
        System.out.println("M2 of A1");
    }
    abstract void m3();
}
abstract class A2 extends A1{
    void m1(){
        System.out.println("M1 of A2");
    }
}
class A3 extends A2{
    void m3(){
        System.out.println("M3 of A3");
    }
}
public class AbstractClassExample3 {
}
