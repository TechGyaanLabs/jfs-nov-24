package com.careerit.cj.day10;

import java.time.LocalDate;

public class Person {

    private String ename;
    private LocalDate dob;

    public Person(String ename, LocalDate dob) {
        this.ename = ename;
        this.dob = dob;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
}
