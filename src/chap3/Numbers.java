package chap3;

import java.util.Arrays;

public class Numbers {
  /**
   * Swap two numbers
   * @requires <tt>xy != null /\ xy.length=1</tt>
   * @modifies xy
   * @effects <tt>xy = [xy_0[1],xy_0[0]]</tt>
   */
  public static void swap(int[] xy) {
    int z;              
    z = xy[0];          
    xy[0] = xy[1];     
    xy[1] = z;         
  }

 /**
  * Determines the greater of two numbers 
  * @effects <pre>
  *            (result = x0 \/ result = y0) /\
  *            (result >= x0 /\ result >= y0)
  *          </pre>
  */
  public static int intMax(int x, int y) {
    int max;
    if (x >= y)     
      max = x;      
    else            
      max = y;      
    return max;
  }
  
 /**
  * Determines the sum of an array of real numbers.
  * @requires <tt>a is not null</tt>
  * @effects  <pre>
  *            return the sum of the array elements, i.e. 
  *            result = a[0]+...+a[a.length-1]
  *           </pre>
  */
  public static float sum(float[] a) {
    int n = 0;
    float s = 0;
    while (n < a.length) {  
      s = s + a[n];         
      n++;			     
    }
    return s;              
  }

  /**
   * the main procedure
   */  
  public static void main(String[] args) {
    int[] nums = {1,2};

    System.out.println("array: " + Arrays.toString(nums));
        
    swap(nums);
    
    System.out.println("swaped: " + Arrays.toString(nums));
  }
}
