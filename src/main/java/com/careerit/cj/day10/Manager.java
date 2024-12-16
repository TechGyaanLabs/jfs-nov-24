package com.careerit.cj.day10;

class X{

}
class Y extends  X{
    Z obj = new Z();
}
class Z{

}
public class Manager {

    public static void main(String[] args) {
        Y obj = new Y();
        System.out.println(obj instanceof X);
    }
}
