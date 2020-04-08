package chap3.implementdemo;

import utils.TextIO;

/**
 * @overview A program that computes the sum of real numbers that are obtained 
 *   from the user via the standard input
 * @author dmle
 */
public class Sum {

  /**
   * the main procedure
   * 
   * @effects 
   *  {@link #getNumbers()}: obtain some real numbers from the user  
   *  {@link #sum(float[])}: compute the sum of the numbers
   *  {@link TextIO#putln()}: print the sum
   */
  public static void main(String[] args) {
    float[] numbers = getNumbers();
    
    float s = sum(numbers);
    
    TextIO.putln("The sum is: " + s);
  }

  /**
   * Determine the sum of array of real numbers
   * 
   * @requires a is not null
   * @effects return the sum of the array elements, i.e. result =
   *          a[0]+...+a[a.length-1]
   */
  private static float sum(float[] a) {
    float s = 0;
    
    for (float x : a) {
      s = s + x;
    }
    
    return s;
  }

  /**
   * Obtain an array of real numbers from the user via keyboard.
   * 
   * @effects 
   *  prompt the user for the number of numbers needed
   *  initialise an array whose size is the specified number
   *  while array is not filled
   *    {@link #read()}: prompt the user to enter a new real number to add to the array
   *  return the array
   */
  private static float[] getNumbers() {
    TextIO.putln("How many numbers do you need?");
    int n  = TextIO.getlnInt();
    // validate n: n >= 1
    while (n < 1) {
      TextIO.putln("Invalid number: " + n + ". Please re-enter.");
      n = TextIO.getlnInt();
    }
    
    float[] numbers = new float[n];
    
    for (int i = 0; i < n; i++) {
      TextIO.putln("Enter next number");
      numbers[i] = read();
    }
    
    return numbers;
  }

  /**
   * Read a real number from the user via keyboard
   * @effects 
   *  do 
   *    {@link TextIO#getlnFloat()}: prompt the user to enter a real number
   *  while input is invalid 
   */
  private static float read() {
    float num = TextIO.getlnFloat();
    
    return num;
  }
}
