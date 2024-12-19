package com.careerit.cj.day15;

class A1{
    public void m1() {
        System.out.println("M1 method called from A");
    }
    public void m2() {
        System.out.println("M2 method called from A");
    }
}
class B1 extends  A1{
    public void m3(){
        System.out.println("M3 method called from B");
    }
}

public class InheritanceExample {

    public static void main(String[] args) {

            B1 obj = new B1();
            obj.m1();
            obj.m2();
            obj.m3();
    }
}
