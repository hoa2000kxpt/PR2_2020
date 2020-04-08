package Tut_01;

import utils.TextIO;

public class Ex3_4 {
    public static void main(String[] args) {
        System.out.print ("Enter a sentence: ");
        String line = TextIO.getln ();

        boolean didCR = true;
        for ( int i = 0;  i < line.length();  i++ ) {
            char ch = line.charAt(i);
            if ( Character.isLetter(ch) ) {
                System.out.print(ch);
                didCR = false;
            }
            else {
                if ( didCR == false ) {
                    System.out.println();
                    didCR = true;
                }
            }
        }

        System.out.println();
    }
}
