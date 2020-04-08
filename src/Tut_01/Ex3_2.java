package Tut_01;

import utils.TextIO;

public class Ex3_2 {
    public static void main(String[] args) {
        int num = 0;
        int maxDivisors = 1;
        int maxValue = 1;




        for ( num = 2;  num <= 10000;  num++ ) {

            int divisorTest = 0;  // A number to be tested to see if it's a divisor of N.
            int divisorCount = 0;  // Number of divisors of N.



            for ( divisorTest = 1;  divisorTest <= num;  divisorTest++ ) {  // Count the divisors of N.
                if ( num % divisorTest == 0 )
                    divisorCount++;
            }

            if (divisorCount > maxDivisors) {
                maxDivisors = divisorCount;
                maxValue = num;
            }

        }

        System.out.println("Among integers between 1 and 10000,");
        System.out.println("The maximum number of divisors is " + maxDivisors);
        System.out.println("A number with " + maxDivisors + " divisors is " + maxValue);

    }

}

