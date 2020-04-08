package Tut_01;

import utils.TextIO;

public class Ex2_5 {
    public static void main(String[] args) {
        System.out.print ("How many eggs do you have? ");
        int eggs = TextIO.getlnInt ();

        int dozen = eggs / 12;
        int extra = eggs % 12;

        System.out.println ("Your number of eggs: "+ dozen + " dozens and "+ extra + " extras." );



    }
}
