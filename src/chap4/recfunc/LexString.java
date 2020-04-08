package chap4.recfunc;

// a program that checks the lexicographical order of strings
public class LexString {
  
  // checks the lexicographical order of strings
  public static boolean precedes (String w, String x) {
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
    if (wlen == 0 && xlen==0)
      return false;
    else if (wlen == 0)
      return true;
    else if (xlen == 0)      
      return false;
    
    // basis (2)
    char w0 = w.charAt(0);
    char x0 = w.charAt(0);
    if (w0 < x0)
      return true;
    else if (w0 > x0)
      return false;
    else  /* (w0=x0) induction   */
      return precedes(w.substring(1),x.substring(1));
  }
  
  // run method
  public static void main(String[] args) {
    String w = "base";// "batter"; 
    String x = "batter";
    boolean p = precedes(w,x);
    System.out.printf("precedes(%s,%s)=%b",w,x,p);
  }
}
