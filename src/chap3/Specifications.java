package chap3;

public class Specifications {
  /**
   * @requires <tt>a != null</tt> /\ <tt>e</tt> is an integer
   * @effects if <tt>e</tt> is in <tt>a</tt> 
   *            return <tt>true</tt>
   *           else
   *            return <tt>false</tt>
   *            
   * <p> e.g.: <br>
   *  <pre>
   *    int[] a = {1,2,3};
   *    boolean b = isIn(a,2); // true
   *    b = isIn(a,4);         // false
   *  </pre>
   */
   public static boolean isIn(int[] a, int e) {
     return false;
   }
}
