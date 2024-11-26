package com.careerit.cj.day4;

enum Day { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY; }

public class NumberOfLettersInDayName {


    public static void main(String[] args) {

        int numberOfLetters = 0;

        Day day = Day.FRIDAY;

        numberOfLetters = switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> 6;
            case TUESDAY -> 7;
            case THURSDAY, SATURDAY -> 8;
            case WEDNESDAY -> 9;
            default -> throw new IllegalStateException("Invalid day: " + day);
        };

        System.out.println("Day "+day+" has "+numberOfLetters+" letters");


    }


}
