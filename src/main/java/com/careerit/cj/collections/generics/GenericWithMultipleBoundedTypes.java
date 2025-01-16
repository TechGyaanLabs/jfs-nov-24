package com.careerit.cj.collections.generics;


import lombok.Getter;
import lombok.Setter;

import java.util.List;


class Worker<T extends Person & Comparable<T>> {

    private T person;

    public Worker(T person) {
        this.person = person;
    }

    public T getPerson() {
        return person;
    }


}

@Getter
@Setter
class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

}

class Employee extends Person implements Comparable<Employee> {

    public Employee(String name) {
        super(name);
    }

    @Override
    public int compareTo(Employee o) {
        return this.getName().compareTo(o.getName());
    }
}

public class GenericWithMultipleBoundedTypes {


    public static void printList(List<?> list) {

        for (Object obj : list) {
            System.out.println(obj);
        }

    }

    public static double sumList(List<? extends Number> list){
        double sum = 0;
        for(Number num:list){
            sum += num.doubleValue();
        }
        return sum;
    }


    public static void addNumbers(List<? super A11> list){
        list.add(new A22());
        list.add(new A33());
        list.add(new A11());
    }


    public static void main(String[] args) {
        Worker<Employee> worker = new Worker<>(new Employee("John"));
        System.out.println(worker.getPerson().getName());

        List<String> strList = List.of("A", "B", "C");
        printList(strList);

        List<Integer> list = List.of(1,2,3,4,5,6);
        double result = sumList(list);
        System.out.println(result);
    }
}

class A11{

}
class A22 extends  A11{

}
class A33 extends  A22{

}