package com.careerit.cj.day7;

import java.util.Arrays;

public class ArrayExample5 {

    public static void main(String[] args) {
        String data = "1001-Krish-35000-CS,1002-Manoj-45000-IS,1003-John-85000-CS,1004-Arif-95000-IS";
        String[] empArr = data.split(",");
        double totalSal = 0;

        for(String emp : empArr){

            String[] arr = emp.split("-");
            String empno = arr[0];
            String name = arr[1];
            double salary = Double.parseDouble(arr[2]);
            String dept = arr[3];
            totalSal += salary;
            System.out.println("Empno : "+empno+" Name : "+name+" Salary : "+salary+" Dept : "+dept);

        }
        System.out.println("Total salary : "+totalSal);
    }
}
