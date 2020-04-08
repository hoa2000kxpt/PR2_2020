package chap5_3;

/**
 * @overview Represents a lexicographic order of two strings.  
 * @author dmle
 */
public class Precedes {
  private String w;
  private String x;
  private boolean val;
  
  /**
   * Recursively lexicographically compare two strings
   * @requires w != null /\ x != null /\ x != ""
   */
  public Precedes(String w, String x) {
    /*
     * BASIS. There are two parts of the basis.
     *  1. e < w for any string w other than e itself.
     *  (e is the empty string, or the string with no characters.)
     *  2. If c < d, where c and d are characters, then for any strings
     *  w and x, we have cw < dx.
     *
     * INDUCTION. If w < x for strings w and x, then for any character c
     *            we have cw < cx. 
     */
    // basis (1)
    int wlen = w.length();
    int xlen = x.length();
    if (wlen == 0 && xlen==0) {
      val = false;
    } else if (wlen == 0) {
      val = true;
    } else if (xlen == 0) {      
      val = false;
    } else {    
      // basis (2)
      char w0 = w.charAt(0);
      char x0 = w.charAt(0);
      if (w0 < x0)
        val = true;
      else if (w0 > x0)
        val = false;
      else  /* (w0=x0) induction   */
        val = (new Precedes(w.substring(1),x.substring(1))).val;
    }    
  }
  
  /**
   * @effects
   *  return val
   */
  public boolean getValue() {
    return val;
  }
}
