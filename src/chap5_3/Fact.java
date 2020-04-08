package chap5_3;

/**
 * @overview
 *  Represents a factorial number.
 *  
 * @author dmle
 */
public class Fact {
  private int val;
  
  /**
   * @requires n >= 1
   * @effects constructs this using the recursive 
   *  definition
   */
  public Fact(int n) {
    if (n == 1) {
      val = 1;
    } else {
      val = n * (new Fact(n-1)).val;
    }
  }
  
  /**
   * @effects
   *  return val
   */
  public int getValue() {
    return val;
  }
}
