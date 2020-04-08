package chap3;

/**
 * @overview 
 *
 * @author dmle
 *
 * @version 
 */
public class SearchMultiple {
  // if x is stored in a then return the index of x, otherwise return -1
  public static int search1(int[] a, int x) {
    for (int i = 0; i < a.length; i++) {
      if (x == a[i]) {
        return i; // x is in a
      }
    }
    
    // x is not in a
    return -1;
  }
  
 // if x is stored in a then return the index of x, otherwise return -1
 public static int search2(int[] a, int x) {
   int i = 0;
   while (i < a.length) {
     if (x == a[i]) return i;
     
     i++;
   }
   
   return -1;
 }
 
 // if x is stored in a then return the index of x, otherwise return -1
 public static int search3(int[] a, int x) {
   for (int i = a.length-1; i >= 0; i--) {
     if (x == a[i]) {
       return i; // x is in a
     }
   }
   
   // x is not in a
   return -1;
 }

 // if x is stored in a then return the index of x, otherwise return -1
 public static int search4(int[] a, int x) {
   for (int i = 0; i < a.length && i % 2 == 0; i--) {
     // use even indices
     if (x == a[i]) {
       return i; // x is in a
     }
   }

   for (int i = 0; i < a.length && i % 2 == 1; i--) {
     // use odd indices of a
     if (x == a[i]) {
       return i; // x is in a
     }
   }

   // x is not in a
   return -1;
 }

}
