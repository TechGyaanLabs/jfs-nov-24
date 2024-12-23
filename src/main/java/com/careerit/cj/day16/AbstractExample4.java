package com.careerit.cj.day16;

import java.util.ArrayList;
import java.util.List;

abstract class NumberOperations {

    public int primeInRange(int lb,int ub){
        int count = 0;
        for(int i=lb;i<=ub;i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }
    abstract boolean isPrime(int num);

    public List<Integer> generatePrimeNumbers(int lb,int ub){
        List<Integer> list = new ArrayList<>();
        for(int i=lb;i<=ub;i++){
            if(isPrime(i)){
                list.add(i);
            }
        }
        return list;
    }
}

class MyNumberOperations extends NumberOperations{

    @Override
    boolean isPrime(int num) {
        if(num < 2){
            return false;
        }
        for(int i=2;i<=num/2;i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}

public class AbstractExample4 {

    public static void main(String[] args) {

            NumberOperations obj = new MyNumberOperations();
            System.out.println(obj.primeInRange(10, 50));
            System.out.println(obj.generatePrimeNumbers(10, 50));
    }
}
