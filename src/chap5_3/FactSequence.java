package chap5_3;

import java.util.Arrays;

/**
 * @overview
 *  Represents a sequence of factorial numbers.
 *  
 * @author dmle
 */
public class FactSequence {
  private Fact[] seq;
  
  /**
   * @effects
   *  initialise this as a sequence of the first m factorials
   */
  public FactSequence(int m) {
    seq = new Fact[m];
    new Fact(m);
  }
  
  /**
   * @effects print sequence <tt>seq</tt> to terminal console
   */
  public void print() {
    System.out.println(Arrays.toString(seq));
  }
  
  /**
   * @overview
   *  A private class that represents a factorial.
   *  
   * @author dmle
   */
  private class Fact {
    private int val;
    
    /**
     * Recursively construct this
     * 
     * @requires n >= 1
     */
    public Fact(int n) {
      if (n == 1) {
        val = 1;
      } else {
        val = n * (new Fact(n-1)).val;
      }
      // record all Fact objects in sequence
      seq[n-1] = this;
    }
    
    public int getValue() {
      return val;
    }
    
    @Override
    public String toString() {
      return val+"";
    }
  } // end Fact
} // end FactSequence
