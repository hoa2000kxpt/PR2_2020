package chap4;

/**
 * @overview
 *  Solves GCD using repeated division and with two algorithms: 
 *  (1) recursive and (2) iterative (loop).
 *  
 * @author dmle
 */
public class GcdByDiv {  
  
  /**
   * Solves GCD using a recursive algorithm.
   * 
   * @requires x > y /\ y >= 1
   * @effects
   *   return the greatest common divisor (GCD) of x and y; 
   *   i.e. the largest natural number by which both x and y are divisible; 
   *   e.g. GCD(6,9) = 3, GCD(3,5) = 1
   */
  public static int gcdRecursive(int x, int y) {
    /*
     * BASIS. for all natural numbers x > 0, y = 0: GCD(x,y)=x
     * INDUCTION. for all natural numbers x > y > 0: GCD(x,y)=GCD(y,x mod y)
     */
    if (y == 0) {
      return x;
    } else {
      return gcd(y, x % y);
    }
  }
  
  /**
   * Solves GCD using an iterative algorithm.
   * 
   * @requires x > y /\ y >= 1
   * @effects
   *   return the greatest common divisor (GCD) of x and y; 
   *   i.e. the largest natural number by which both x and y are divisible; 
   *   e.g. GCD(6,9) = 3, GCD(3,5) = 1
   */
  public static int gcd(int x, int y) {
    int temp;
    /*
     * Loop variant: 
     *  P(y) = false  if y != 0
     *         true   if y = 0
     * Loop invariant:
     *  x > y /\ Gcd(x0,y0) = Gcd(x,y)
    */
    while (y != 0) {
      temp = y;
      y = x % y;
      x = temp;
   }
   return x;
  }
  
  public static void main(String[] args) {
    int x = 6, y = 9;
    
    System.out.printf("gcd(%d,%d) = %d%n", x, y, gcd(x,y));
  }
}
