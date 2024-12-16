package com.careerit.cj.day12;

public class Student {
    private String name;
    private int marks;
    private String sem;

    private static int count = 0;

    public Student() {
        this.name = "Unknown";
        this.marks = 0;
        this.sem = "1st Sem";
        count++;
    }
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
        this.sem = "1st Sem";
        count++;
    }
    public Student(String name, int marks, String sem) {
        this.name = name;
        this.marks = marks;
        this.sem = sem;
        count++;
    }

    public void setValues(String name, int marks, String sem) {
        this.name = name;
        this.marks = marks;
        this.sem = sem;
    }

    public void showInfo() {
        System.out.println("Name : " + name);
        System.out.println("Marks : " + marks);
        System.out.println("Sem : " + sem);
    }

    public static void showCount() {
        System.out.println("Total students : "+count);
    }

}
