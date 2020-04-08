package Tut_01;

import java.util.Scanner;
import utils.TextIO;

public class Ex2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print ("How many quarters do you have? ");
        int quarters = TextIO.getlnInt ();
        System.out.print ("How many dimes do you have? ");
        int dimes = TextIO.getlnInt ();
        System.out.print ("How many nickels do you have? ");
        int nickels = TextIO.getlnInt ();
        System.out.print ("How many pennies do you have? ");
        int pennies = TextIO.getlnInt ();

        double total = (0.25 * quarters) + (0.10 * dimes) + (0.05 * nickels) + (0.01 * pennies);

        System.out.println ("\n");
        System.out.println ("Your money is " + total + " $.");
    }
}
