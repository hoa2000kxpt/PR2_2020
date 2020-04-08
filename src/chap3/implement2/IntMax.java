package chap3.implement2;

public class IntMax {
  
  /**
   * @effects <pre>
   *            (result = x0 \/ result = y0) /\
   *            (result >= x0 /\ result >= y0)
   *          </pre>
   */
  public static int intMax(int x, int y) {
    int max;
    if (x >= y)     // x>=y
      max = x;      // max = x0 /\ max >= y0
    else            // x<y
      max = y;      // max = y0 /\ max > x0
    return max;
  }
}
