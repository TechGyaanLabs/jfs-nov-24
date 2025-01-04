package com.careerit.cj.collections.listex;

import java.util.List;

public class EmployeeManager {

    public static void main(String[] args) {

        EmployeeService empService = new EmployeeService();

        // Get all employee names

        List<String> names = empService.getEmployeeNames();
        System.out.println(names);

        // Get all the dept names

        List<String> deptNames = empService.getDepartmentNames();
        System.out.println(deptNames);


        // Get employees of QA dept

        String dept = "QA";

        List<Employee> qaEmployees = empService.getEmployeeOfDept(dept);
        System.out.println(qaEmployees);

        // Get max paid employee(s)

        List<Employee> maxPaidEmployees = empService.getMaxPaidEmployees();
        System.out.println(maxPaidEmployees);


        // Get employees sort by salary in desc order

        List<Employee> empList = empService.getEmployeesSortBySalaryDesc();
        System.out.println(empList);

    }
}
