package Tut_01;

import utils.TextIO;

public class Ex2_2_CORE {
    public static void main(String[] args) {
        // initialize variables: dieNum1, dieNum2 and total
        int dieNum1 = (int) (Math.random () * 6) + 1;
        int dieNum2 = (int) (Math.random () * 6) + 1;
        int total = dieNum1 + dieNum2;

        // Print out the result of the number on first, second die and count the total
        System.out.println ("The first die: " + dieNum1);
        System.out.println ("The second die: " + dieNum2);
        System.out.println ("The total roll: " + total);
    }
}
