package com.careerit.cj.day13;

public class StaticInnerClassExample {

    static class  InnerCls{
        public  void showGreetings(){
            System.out.println("Hello from inner class");
        }
    }

    public static void main(String[] args) {

        StaticInnerClassExample.InnerCls obj = new StaticInnerClassExample.InnerCls();
        obj.showGreetings();
    }
}
