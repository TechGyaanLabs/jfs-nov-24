package com.careerit.cj.collections.setex;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
class Employee {
    private int empno;
    private String name;
    private double salary;
}

public class AssignmentQuestion {

    public static void main(String[] args) {

        Employee emp1 = new Employee(1001, "Krish", 45000);
        Employee emp2 = new Employee(1002, "Manoj", 55000);
        Employee emp3 = new Employee(1003, "Charan", 65000);
        Employee emp4 = new Employee(1004, "Tanvi", 75000);
        Employee emp5 = new Employee(1005, "Sanaya", 85000);
        Employee emp6 = new Employee(1001, "Krish", 45000);
        Employee emp7 = new Employee(1002, "Manoj", 55000);
        Employee emp8 = new Employee(1003, "Charan", 65000);
        Employee emp9 = new Employee(1006, "John", 75000);
        Employee emp10 = new Employee(1007, "Doe", 85000);

        List<Employee> cs = List.of(emp1, emp2, emp5);
        List<Employee> ec = List.of(emp6, emp7, emp8, emp9, emp10);
        List<Employee> is = List.of(emp7, emp3, emp4);

        // Find the unique employees from cs, ec and is

    }
}
