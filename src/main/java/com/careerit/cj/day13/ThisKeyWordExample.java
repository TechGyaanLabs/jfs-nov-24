package com.careerit.cj.day13;

class Employee {

    private int empno;
    private String ename;
    private double salary;

   public Employee(int empno, String ename, double salary){
        this.empno = empno;
        this.ename = ename;
        this.salary = salary;
    }

    public void show() {
        System.out.println(this.empno + " " + this.ename + " " + this.salary);
    }
}
public class ThisKeyWordExample {

    public static void main(String[] args) {
        Employee emp = new Employee(1001, "Krish", 45000);
        emp.show();
    }
}
