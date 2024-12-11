package com.careerit.cj.day10;

import java.time.LocalDate;

public class Employee extends Person {

    private int empno;
    private double salary;

    private Project project;

    public Employee(int empno, String name, LocalDate dob, double salary, Project project) {
        super(name, dob);
        this.empno = empno;
        this.salary = salary;
        this.project = project;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Project getProject() {
        return project;
    }
}
