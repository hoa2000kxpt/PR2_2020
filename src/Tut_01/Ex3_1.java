package Tut_01;

import utils.TextIO;

public class Ex3_1 {
    public static void main(String[] args) {
        int count = 0;
        while (true) {
            int dieNum1 = (int) (Math.random () * 6) + 1;
            int dieNum2 = (int) (Math.random () * 6) + 1;

            System.out.println ("The first die: " + dieNum1);
            System.out.println ("The second die: " + dieNum2);
            System.out.println ("\n");
            if (dieNum1 == 1 && dieNum2 == 1) {
                System.out.println ("The number of rolls: " + count);
                System.exit (4);
            } else count++;
        }
    }
}
