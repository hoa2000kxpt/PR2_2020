package chap3.implement2;

public class Swap {
  /**
   * @requires <tt>xy != null && xy.length=1</tt>
   * @modifies xy
   * @effects <tt>xy = [xy_0[1],xy_0[0]]</tt>
   */
  public static void swap(int[] xy) {
    int z;              // xy = xy_0
    z = xy[0];          // z=xy_0[0] & xy[1]=xy_0[1]
    xy[0] = xy[1];      // z=xy_0[0] & xy[0]=xy_0[1]
    xy[1] = z;          // xy[1]=xy_0[0] & xy[0]=xy_0[1]
  }
}
