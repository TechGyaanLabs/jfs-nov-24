package com.careerit.cj.day10;

import java.util.List;

public class MealBookingManager {
    public static void main(String[] args) {

        List<MealBooking> bookings = List.of(new MealBooking("Krish", "Hyd", Day.MON, 2),
                new MealBooking("Manoj", "Bang", Day.TUE, 3), new MealBooking("Charan", "Hyd", Day.WED, 4),
                new MealBooking("Rajesh", "Hyd", Day.THU, 5), new MealBooking("Suresh", "Hyd", Day.FRI, 6),
                new MealBooking("Ramesh", "Hyd", Day.SAT, 7), new MealBooking("Ganesh", "Hyd", Day.SUN, 8));

        double totalAmount = getTotalAmount(bookings);
    }

    // If Day is SAT, SUN => 600
    // If Day is TUE, WED => 200
    // If Day is MON, THU, FRI => 400
    private static double getTotalAmount(List<MealBooking> bookings) {
        return 0;
    }
}
