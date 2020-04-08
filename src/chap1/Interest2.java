package chap1;

import static utils.TextIO.*;

/**
 * This class implements a simple program that will compute
 * the amount of interest that is earned on an investment over
 * a period of one year. The initial amount of the investment
 * and the interest rate are input by the user. The value of
 * the investment at the end of the year is output. The
 * rate must be input as a decimal, not a percentage (for
 * example, 0.05 rather than 5).
 */
public class Interest2 {

  public static void main(String[] args) {

    double principal; // The value of the investment.
    double rate; // The annual interest rate.
    double interest; // The interest earned during the year.

    put("Enter the initial investment: ");  // TextIO.put()
    principal = getlnDouble();              // TextIO.getlnDouble()

    put("Enter the annual interest rate (decimal, not percentage!): ");
    rate = getlnDouble();

    interest = principal * rate; // Compute this year's interest.
    principal = principal + interest; // Add it to principal.

    put("The value of the investment after one year is $");
    putln(principal);

  } // end main()
} // end Interest2