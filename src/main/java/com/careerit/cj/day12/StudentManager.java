package com.careerit.cj.day12;

public class StudentManager {

    public static void main(String[] args) {

        Student student1 = new Student("John", 90, "5th Sem");
        //student1.setValues("John", 90, "5th Sem");

        Student student2 = new Student("Smith", 85, "6th Sem");
        //student2.setValues("Smith", 85, "6th Sem");
        Student.showCount();
        Student student3 = new Student();
        student3.setValues("Krish", 95, "7th Sem");

        Student student4 = new Student("Manoj", 75);
        Student.showCount();
        Student student5 = new Student();


        student1.showInfo();
        System.out.println("--------------------");
        student2.showInfo();
        System.out.println("--------------------");
        student3.showInfo();
        System.out.println("--------------------");
        student4.showInfo();
        System.out.println("--------------------");
        student5.showInfo();
        Student.showCount();
    }
}
