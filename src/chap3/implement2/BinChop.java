package chap3.implement2;

import java.util.Arrays;

import utils.TextIO;

/** 
 * @overview A program that performs the bin chop algorithm on an array of
 *    numbers
 * @author dmle
 */ 
public class BinChop {
  /**
   * the main method
   * @effects 
  *    initialise an sorted array and a search number
  *    {@link #search(int[],int)}: runs the binary chop algorithm on the array  
  *                      and the number
  *    {@link TextIO#putf(String, Object...)}: print the formatted result
  */   
  public static void main(String[] args) {
    int[][] as = { 
        {1},
        {1,3},
        {1,3,5},
        {1,3,5,7},
        {1,3,5,7,11,13,15}
    };
    
    int[] xs = {0,1,3,4,20};
    
    int[] b = as[3];         // b = [1,3,5,7] 
    int x = xs[3];           // b = [1,3,5,7] /\ x = 4 
    int r = search(b, x);    // b = [1,3,5,7] /\ x = 4 /\ r = 2
    
    TextIO.putf("search(%s,%d) = %d%n", Arrays.toString(b), x, r);
  }


  /**
   * performs the binary chop algorithm on an array of numbers
   * @requires <tt>a is not null /\ a.length > 0 /\ sorted(a), i.e. 
   *               for all i,j: nat. (i<=j<=a.length-1 → a[i] <= a[j])
   *           </tt>
   * @effects <pre>
   *    if a.length = 1 or a[0] > x
   *       returns 0
   *    else if x > a[a.length-1]
   *       return a.length-1
   *    else
   *      returns the index that divides a into two parts,
   *      the left part are smaller than x and the right part are greater 
   *      than or equal to x, i.e. 
   *      0 <= result <= a.length-1 /\ for all i: nat. 
   *             (i<result -> a[i] < x) /\ (result<=i<=a.length-1 -> a[i]>=x)
   *          <pre>
   */
  private static int search(int[] a, int x) {
    if (x < a[0] || a.length == 1)
      return 0;
    else if (x > a[a.length - 1])
      return a.length - 1;

    int m;
    // initialise search area to a
    int left = 0, right = a.length - 1;
    while (right - left > 0) {
      m = (int) ((left + right) / 2);           
      if (a[m] < x) {
        if (left < m)          
          left = m;         
        else          
           left = right;    
      } else {                     
        right = m;          
      }
    }
    return left;          
  }
}