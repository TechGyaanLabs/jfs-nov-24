package com.careerit.cj.day18;

import java.time.LocalDate;
import java.util.List;

interface NumberOperations {
    boolean isPrime(int num);
    default int primeCount(int lb, int ub){
        int count = 0;
        for(int i=lb;i<=ub;i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }
    default  List<Integer> generatePrimeNumbers(int lb, int ub){
        List<Integer> list = new java.util.ArrayList<>();
        for(int i=lb;i<=ub;i++){
            if(isPrime(i)){
                list.add(i);
            }
        }
        return list;
    }

    default int getEvenSum(int lb, int ub){
        int sum = 0;
        for(int i=lb;i<=ub;i++){
            if(isEven(i)){
                sum += i;
            }
        }
        return sum;
    }

    private boolean isEven(int num) {
        return num % 2 == 0;
    }

    static String dayName() {
        LocalDate date = LocalDate.now();
        return date.getDayOfWeek().name();
    }

}

class MyNumberOperations implements NumberOperations {

    @Override
    public boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

public class InterfaceWithDefaultMethods {
    public static void main(String[] args) {

        NumberOperations obj = new MyNumberOperations();
        System.out.println(obj.isPrime(13));
        System.out.println(obj.isPrime(15));
    }
}
