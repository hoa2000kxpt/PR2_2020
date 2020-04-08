package chap3.design;

import utils.TextIO;

/**
 * @overview A program that performs the bin chop algorithm an array of numbers
 */
public class BinChop {
  
   /** 
    * the main procedure
    * @effects 
    *   initialise an sorted array and a search number
    *   {@link #search(int[],int)}: runs the binary chop algorithm on the array  
   *                      and the number
   *     {@link TextIO#putf(String, Object...)}: print the formatted result
   */ 
/*  public static void main(String[] args) */

  /**
   * performs the binary chop algorithm on an array of numbers
   * @requires <tt>a is not null /\ a.length > 0 /\ sorted(a), i.e. 
   *               for all i,j: nat. (i<=j<=a.length-1 -> a[i] <= a[j])
   *           </tt>
   * @effects  <pre>
   *    if a.length = 1 or a[0] > x
   *       returns 0
   *    else if x > a[a.length-1]
   *     return a.length-1
   *    else
   *      returns the index that divides a into two parts,
   *      the left part are smaller than x and the right part are greater 
   *      than or equal to x, i.e. 
   *      0 <= result <= a.length-1 /\ for all i: nat. 
   *             (i<result ->  a[i] < x) /\ (result<=i<=a.length-1 -> a[i]>=x)
   *   <pre>
   * @pseudocode
   *  if x < a[0] OR a.length = 1
   *    return 0
   *  else if x > a[a.length-1]
   *    return a.length-1
   *  initialise search area to a
   *  // a[0] <= x <= a[a.length-1] /\ a.length > 1
   *  // left (of area) = 0 < right = a.length-1 
   *  while search area is not empty
   *    // right – left > 0
   *    look at the element a[m] half way along the search area
   *    // left <= m = |(left + right)/2| < right
   *    
   *    if a[m] < x
   *      if left < m
   *        set search area to the second half starting from m // left = m < right
   *      else                    // left = m = right-1
   *        set left = right      // left = right
   *    else                      // a[m] >= x
   *      set search area to the first half up to m  // left <= m = right
   *  // left = right
   *  return left                      
   */
  /* private static int search(int[] a, int x)*/
}
