package com.careerit.cj.day15;

class T1{
    int num  = 10;
    void m1(){
        System.out.println("T1 "+num);
    }
}
class T2 extends T1{
    int num = 20;
    void m1(){
        System.out.println("T2 "+num);
    }
}
class T3 extends T2{
    int num = 30;
    void m1(){
        System.out.println("T3 "+num);
        System.out.println(super.num);
    }
}
public class SuperQuestion {

    public static void main(String[] args) {

        T1 obj = new T3();
        obj.m1();
        System.out.println(obj.num);
    }
}
