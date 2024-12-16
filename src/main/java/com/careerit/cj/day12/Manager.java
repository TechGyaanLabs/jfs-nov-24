package com.careerit.cj.day12;
import static com.careerit.cj.day12.MathUtil.*;
import static java.lang.System.out;


public class Manager {

    public static void main(String[] args) {

            int a = 36;
            int b = 54;

            int gcd = gcd(a,b);
            out.println("GCD of "+a+" and "+b+" is "+gcd);

            int lcm = lcm(a,b);
            out.println("LCM of "+a+" and "+b+" is "+lcm);

            int[] arr = {10,20,30,40,50};
            int sum = sum(arr);

            out.println("Sum of array elements is :"+sum);

            int num = 12345;

            int rev = reverse(num);
            out.println("Reverse of "+num+" is "+rev);

            Careerit.out.println("Hello");


    }
}
