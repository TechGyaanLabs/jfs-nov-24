package com.careerit.cj.day15;

class One{

    int num = 100;
    One(String name){
        System.out.println(name);
    }
    public void show(){
        System.out.println("Show method " +num);
    }


}
class Two extends One{
    Two(){
        super("Krish");
        System.out.println("Two");
    }
    public void show(){
        System.out.println("Show method of Two");
    }

    void display(){
        super.show();
        show();
    }

}


public class SuperMethods {

    public static void main(String[] args) {

        Two obj = new Two();

        obj.display();

    }
}
