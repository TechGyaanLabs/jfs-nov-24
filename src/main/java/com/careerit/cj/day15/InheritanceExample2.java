package com.careerit.cj.day15;

class P1{
    public void m1(){
        System.out.println("M1 of P1");
    }
}
class P2 extends  P1{
    public void m1(){
        System.out.println("M1 of P2");
    }
    public void m2(){
        System.out.println("M2 of P2");
    }
}
class P3 extends  P2{
    public void m3(){
        System.out.println("M3 of P3");
    }
}
public class InheritanceExample2 {

    public static void main(String[] args) {

            P1 obj = new P3();
            P3 ob1 = (P3)obj;

            ob1.m1();
            ob1.m2();
            ob1.m3();





    }
}
