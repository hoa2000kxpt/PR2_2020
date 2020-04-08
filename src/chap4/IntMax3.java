package chap4;

import utils.TextIO;

/**
 * @overview
 *  A program that determines the max of three numbers.  
 *  
 * @author dmle
 */
public class IntMax3 {    
  /**
   * Determines the max of three numbers.
   * 
   * @effects <pre>
   *            (result = x \/ result = y \/ result = z) /\
   *            (result >= x /\ result >= y /\ result >= z)
   *          </pre>
   */
  public static int intMax(int x, int y, int z) {
    int max;
    if (x >= y) {     // x >= y
      if (y >= z || x >= z) {
        max = x;      // max = x /\ max >= y /\ max >= z
      } else {        // y < z /\ x < z
        max = z;      // max = z /\ max > x /\ max > y
      }
    } else {          // x < y
      if (y >= z) {
        max = y;      // max = y /\ max > x /\ max >= z
      } else {        // y < z
        max = z;      // max = z /\ max > y /\ max > x      
      }
    }
    
    return max;
  }
  
  /**
   * The main procedure
   * 
   * @effects 
   *  initialise three integer numbers
   *  {@link #intMax(int, int, int)}: determine the max number
   *  print the result
   */
  public static void main(String[] args) {
    int x = 4, y = 1, z = 3;
    
    TextIO.putf("intMax(%d,%d,%d) = %d%n",x,y,z,intMax(x,y,z));
  }
}
