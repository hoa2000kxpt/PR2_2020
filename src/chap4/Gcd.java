package chap4;

/**
 * @overview
 *  Solves GCD using repeated subtraction and with two algorithms: 
 *  (1) recursive and (2) iterative (loop).
 *  
 * @author dmle
 */
public class Gcd {

  /**
   * Solves GCD using a recursive algorithm.
   * 
   * @requires x > 0 /\ y >= 0
   * @effects
   *   return the greatest common divisor (GCD) of x and y; 
   *   i.e. the largest natural number by which both x and y are divisible; 
   *   e.g. GCD(0,100) = 100, GCD(6,9) = 3, GCD(3,5) = 1
   */
  public static int gcdRecursive(int x, int y) {
    /*
     * BASIS. for all natural numbers x > 0: 
     *       i) GCD(x,x)=x
     *      ii) GCD(x,0)=x
     * INDUCTION. for all natural numbers x, y (x > 0), there are two cases:
     *       i) GCD(x,y)=GCD(x-y,y) if x > y
     *       ii) GCD(x,y)=GCD(x,y-x) if x < y
     */
    if (x == y || y == 0) {
     return x;
   } else if (x > y) {
     return gcd(x-y,y);
   } else {
     return gcd(x,y-x);
   }
  }
  
  /**
   * Solves GCD using an iterative algorithm.
   * 
   * @requires x > 0 /\ y >= 0
   * @effects
   *   return the greatest common divisor (GCD) of x and y; 
   *   i.e. the largest natural number by which both x and y are divisible; 
   *   e.g. GCD(0,100) = 100, GCD(6,9) = 3, GCD(3,5) = 1
   */
  public static int gcd(int x, int y) {
   /*
    * Loop variant: 
    *  P(x,y) = false  if x-y != 0
    *         true  if x-y  = 0
    * Loop invariant:
    *   Gcd(x0,y0) = Gcd(x,y)
    */
    while (x != y) {
      if (x > y)
        x = x - y;
      else
        y = y - x;
    }

    return x;
  } 
  
  public static void main(String[] args) {
    int x = 3, y = 0;
    
    System.out.printf("gcd(%d,%d) = %d%n", x, y, gcd(x,y));
  }
}
