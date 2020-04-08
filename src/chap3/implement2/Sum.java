package chap3.implement2;

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
    
    // r=[x1,x2,...,xn] /\ Real(xi)
    s = sum(r);          // s = sum(i=0 to r.length-1) r[i]
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
      // a.length-n > 0
      s = s + a[n];     // s=s_(n-1) + a[n]
      n++;              // s=s_(n-1) + a[n] /\ n=n+1
    }
    // n=a.length
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
    // a = [0f,...,0f] /\ a.length=n
    for (int i = 0; i < n; i++) {
      f = read();     // Real(f)
      a[i] = f;       // Real(a[i])
    }
    
    // a = [x1,x2,...,xn] /\ Real(xi)
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
    // Real(num)
    return num;
  }
}
