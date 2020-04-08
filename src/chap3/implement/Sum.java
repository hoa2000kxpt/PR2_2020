package chap3.implement;

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
    float s = 0;
    float[] r = getNumbers();
    
    s = sum(r);          
    TextIO.putln("sum = " + s);
  }

  /**
   * Determine the sum of array of real numbers
   * 
   * @requires a is not null
   * @effects return the sum of the array elements, i.e. result =
   *          a[0]+...+a[a.length-1]
   */
  private static float sum(float[] a) {
    int n = 0;
    float s = 0;
    while (n < a.length) {
      s = s + a[n];     
      n++;              
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
    // ask user for how many numbers she needs
    TextIO.putln("How many numbers do you need?");
    int n = TextIO.getlnInt();
    while (n < 0) {
      TextIO.putln("Invalid number: " + n + ". Please reenter.");
      n = TextIO.getlnInt();
    }
    
    float[] a = new float[n];
    float f;
    for (int i = 0; i < n; i++) {
      f = read();
      a[i] = f;
    }
    
    return a;
  }

  /**
   * Read a real number from the user via keyboard
   * @effects 
   *  do 
   *    {@link TextIO#getlnFloat()}: prompt the user to enter a real number
   *  while input is invalid 
   */
  private static float read() {
    TextIO.putln("Enter next real number:");
    float num = TextIO.getlnFloat();
    return num;
  }
}
