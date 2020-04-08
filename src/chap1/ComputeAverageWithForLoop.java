package chap1;

import static utils.TextIO.*;

/**
 * This program reads a sequence of positive integers input
 * by the user, and it will print out the average of those
 * integers. The user is prompted to enter one integer at a
 * time. The user must enter a 0 to mark the end of the
 * data. (The zero is not counted as part of the data to
 * be averaged.) The program does not check whether the
 * user's input is positive, so it will actually add up
 * both positive and negative input values.
 */

public class ComputeAverageWithForLoop {

  public static void main(String[] args) {

    int inputNumber; // One of the integers input by the user.
    int sum; // The sum of the positive integers.
    int count; // The number of positive integers.
    double average; // The average of the positive integers.

    /* Initialize the summation and counting variables. */

    sum = 0;
    
    put("Enter how many numbers you will use: ");
    count = getlnInt();

    /* Read and process the user's input. */
    for (int i = 1; i <= count; i++) {
      putf("Enter positive integer #%d: ", i);
      inputNumber = getlnInt();
      sum += inputNumber; // Add inputNumber to running sum.
    }
    
    /* Display the result. */

    if (count == 0) {
      putln("You didn't enter any data!");
    } else {
      average = ((double) sum) / count;
      putln();
      putln("You entered " + count + " positive integers.");
      putf("Their average is %1.3f.\n", average);
    }

  } // end main()

} // end class ComputeAverageWithForLoop
