package com.careerit.cj.day17;

interface I1{
    public abstract void m1();
    abstract void m4();
}
interface I2{
    public void m2();
}
interface I3 extends I1, I2{
    void m1();
    void m3();
}
class C1 implements I1, I2, I3{

    public void m1(){
        System.out.println("M1 method");
    }

    @Override
    public void m4() {
        System.out.println("M4 method");
    }

    public void m2(){
        System.out.println("M2 method");
    }
    public void m3(){
        System.out.println("M3 method");
    }

}

class One{
    public int sum(int a, int b){
        return a + b;
    }
    int sum(int a, int b, int c){
        return a + b + c;
    }

    float sum(float a, float b){
        return a + b;
    }
    float sum(int a, float b){
        return a + b;
    }
    float sum(float a, int b){
        return a + b;
    }
}

public class InterfaceExample {
}
