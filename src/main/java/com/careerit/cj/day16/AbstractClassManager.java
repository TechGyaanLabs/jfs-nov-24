package com.careerit.cj.day16;

abstract class One{

        void m1(){
            System.out.println("One");
        }
        abstract void m2();
}

abstract class Two{

        void m1(){
            System.out.println("Two");
        }
        void m2(){
            System.out.println("Two");
        }
}
class Three extends Two{

        void m3(){
            System.out.println("Three");
        }
}
public class AbstractClassManager {

    public static void main(String[] args) {
        Two obj = new Three();
    }
}
