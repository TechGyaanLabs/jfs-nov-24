package com.careerit.cj.day10;

public class ANoOfDayInGivenMonthAndYear {

    public static void main(String[] args) {

        int year = 2020;
        Month month = Month.FEB;

        int days = getNoOfDaysInMonthAndYear(year, month);
        System.out.println("No of days in "+month+" month of "+year+" year is "+days);
    }

    private static int getNoOfDaysInMonthAndYear(int year, Month month) {
        // Logic to find the no of days in given month and year
        return 0;
    }
}
