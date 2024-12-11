package com.careerit.cj.day10.one;

public class A {

    public int pub_num = 10;
    protected int pro_num = 20;
    int def_num = 30;
    private int pri_num = 40;

    public void pub_show() {
        System.out.println(pub_num);
        System.out.println(pro_num);
        System.out.println(def_num);
        System.out.println(pri_num);
    }
}
