package com.careerit.cj.day10;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {

    public static void main(String[] args) {

        List<Employee> empList = getEmployeeDetails();

        // Collect all the employee name into a list and print the list

        List<String> empNames = new ArrayList<>();
        for(Employee emp:empList) {
            empNames.add(emp.getEname());
        }
        System.out.println(empNames);

        for (Employee emp : empList) {
            System.out.println(emp.getEmpno());
            System.out.println(emp.getEname());
            System.out.println(emp.getDob());
            System.out.println(emp.getSalary());
            Project project = emp.getProject();
            System.out.println(project.getName());
            System.out.println(project.getLocation());
            System.out.println(project.getClient());
            System.out.println("-------------------------------------------------");
        }
    }

    private static List<Employee> getEmployeeDetails() {
        Project project1 = new Project("P_1001", "Google", "Hyderabad");
        Project project2 = new Project("P_1002", "Facebook", "Bangalore");
        Employee emp1 = new Employee(1001, "Krish", LocalDate.now().minusYears(10), 245000, project1);
        Employee emp2 = new Employee(1002, "Manoj",LocalDate.now().minusYears(12), 555000,project2);
        Employee emp3 = new Employee(1003, "Charan", LocalDate.now().minusYears(15),165000,project1);
        Employee emp4 = new Employee(1004, "Ravi", LocalDate.now().minusYears(12),175000,project2);
        Employee emp5 = new Employee(1005, "Sai", LocalDate.now().minusYears(12),258000,project1);

        List<Employee> empList = new ArrayList<>();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);
        return empList;
    }
}
