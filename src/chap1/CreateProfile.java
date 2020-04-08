package chap1;

import static utils.TextIO.*;

public class CreateProfile {

  public static void main(String[] args) {

    String name; // The user's name.
    String email; // The user's email address.
    double salary; // the user's yearly salary.
    String favColor; // The user's favorite color.

    putln("Good Afternoon!  This program will create");
    putln("your profile file, if you will just answer");
    putln("a few simple questions.");
    putln();

    /* Gather responses from the user. */

    put("What is your name?           ");
    name = getln();
    put("What is your email address?  ");
    email = getln();
    put("What is your yearly income?  ");
    salary = getlnDouble();
    put("What is your favorite color? ");
    favColor = getln();

    /* Write the user's information to the file named profile.txt. */

    writeFile("profile.txt"); // subsequent output goes to the file
    putln("Name:            " + name);
    putln("Email:           " + email);
    putln("Favorite Color:  " + favColor);
    putf("Yearly Income:   %,10.2f\n", salary);
    // The "/n" in the previous line is a carriage return, and the
    // comma in %,1.2f adds separators between groups of digits.

    /* Print a final message to standard output. */

    writeStandardOutput();
    putln("Thank you.  Your profile has been written to profile.txt.");
  } // end main
} // end CreateProfile
