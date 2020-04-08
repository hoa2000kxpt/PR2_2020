package chap3;

import java.math.BigDecimal;

public class SquareRoot {
  private static boolean debug = false;

  /**
   * @requires <tt>x >= 0 && .00001 < epsilon < .001</tt>
   * @effects returns <tt>n</tt> such that
   * 
   * <pre>x - epsilon < n^2 <= x + epsilon</pre>
   */
  public static float sqrt(float x, float epsilon) {
    if (x == 0)
      return 0;

    double ans = x / 2.0F;

    // need to use big decimal to preserve the precision values
    final BigDecimal bdX = new BigDecimal(x);
    final BigDecimal dlower = bdX.subtract(new BigDecimal(epsilon));
    final BigDecimal dupper = bdX.add(new BigDecimal(epsilon));

    BigDecimal sq;
    while (true) {
      ans = ans - ((ans * ans - x) / (2 * ans));
      sq = new BigDecimal(ans * ans);
      if (dlower.compareTo(sq) < 0 && dupper.compareTo(sq) >= 0) // found
        break;
    }

    return (float) ans;
  }  

  // the run method
  public static void main(String[] args) {
    //Square root
    float x = 4f;
    float eps = 0.0001f; //0.0001f;//;0.1f;
    double r = sqrt(x, eps);
    System.out.printf("sqrt(%f,%f) = %f%n", x, eps, r);
  }
}
