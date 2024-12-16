package com.careerit.cj.day13;
 class  SimpleCalculator {
        public final double add(double a, double b) {
            return a + b;
        }
        public final double pow(double a, double b) {
            return Math.pow(a, b);
        }
        public final double simpleInterest(double p, double t, double r) {
          return (p * t * r) / 100;
        }

        // p is principal amount
        // n is number of months
        // r is rate of interest (%)
        public final double emiCalculator(double p, int n, double r) {
            r = r / (12 * 100);
            return (p * r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1);
        }
}
class ScientificCalculator extends SimpleCalculator {

    public double sin(double a) {
        return Math.sin(a);
    }



}
public class FinalExample2 {

    public static void main(String[] args) {

        ScientificCalculator obj = new ScientificCalculator();
        System.out.println(obj.add(10, 20));
        System.out.println(obj.pow(2, 3));
        System.out.println(obj.sin(90));
    }
}
