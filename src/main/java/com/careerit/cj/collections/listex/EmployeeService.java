package com.careerit.cj.collections.listex;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {


    List<Employee> list;

    public EmployeeService() {
        list = getEmpDetailsList();
    }

    public List<Employee> getEmployeeOfDept(String dname){
        List<Employee> empList = new ArrayList<>();
        for(Employee emp:list){
            String deptName = emp.getDept();
            if(deptName.equals(dname)){
                empList.add(emp);
            }
        }
        return empList;
    }

    public List<Employee> getMaxPaidEmployees(){
        double maxSalary = getMaxSalary();
        List<Employee> empList = new ArrayList<>();
        for(Employee emp:list){
            if(emp.getSalary() == maxSalary){
                empList.add(emp);
            }
        }
        return empList;
    }

    public List<Employee> getEmployeesSortBySalaryDesc(){
        return null;
    }

    public List<String> getEmployeeNames(){
        List<String> namesList = new ArrayList<>();
        for(Employee emp: list){
            String name = emp.getName();
            if(!namesList.contains(name)){
                namesList.add(name);
            }
        }
        return namesList;
    }

    public List<String> getDepartmentNames(){
        List<String> deptNames = new ArrayList<>();
        for(Employee emp:list){
            String dept = emp.getDept();
            if(!deptNames.contains(dept)){
                deptNames.add(dept);
            }
        }
        return deptNames;
    }
    private double getMaxSalary(){
        double maxSalary = list.getFirst().getSalary();
        for(Employee emp:list){
            if(maxSalary < emp.getSalary()){
                maxSalary = emp.getSalary();
            }
        }
        return maxSalary;
    }
    private List<Employee> getEmpDetailsList() {
        Employee emp1 = new Employee("Krish", "QA", 8000);
        Employee emp2 = new Employee("Manoj", "DevOps", 6000);
        Employee emp3 = new Employee("Ramesh", "Dev", 5000);
        Employee emp4 = new Employee("Balu", "DevOps", 6000);
        Employee emp5 = new Employee("Aruna", "QA", 5000);
        Employee emp6 = new Employee("Haadhya", "DevOps", 6000);
        Employee emp7 = new Employee("Anish", "Dev", 8000);
        Employee emp8 = new Employee("Dummy", "DevOps", 4500);
        Employee emp9 = new Employee("Nimmy", "QA", 3000);
        Employee emp10 = new Employee("John", "DevOps", 8000);
        return new ArrayList<>(List.of(emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8, emp9, emp10));
    }
}
