package Tut_01;

import utils.TextIO;

public class Ex2_6_CORE {
    public static void main(String[] args) {
        // Input your first and last name
        System.out.print ("Please enter your first name and last name, separated by a space: ");
        String name = TextIO.getlnString ();

        // Separate space from the first and last name character
        int space = name.indexOf (' ');
        String firstName = name.substring (0, space);
        String lastName = name.substring (space + 1);

        // Print the first and last name, their length and initials of them
        System.out.println ("Your first name is " + firstName + ", which has " + firstName.length() + " characters.");
        System.out.println ("Your last name is " + lastName + ", which has " + lastName.length() + " characters.");
        System.out.println ("Your initials are " + firstName.charAt(0) + lastName.charAt(0));

    }
}

// Note: use charAt(), indexOf(), substring();
