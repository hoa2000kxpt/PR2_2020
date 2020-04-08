package chap4.recfunc;

// a program that computes the sum of the first n+1 natural numbers using 
// recursion
public class Sum {
  
  // computes the sum of the first n+1 natural numbers: 0,...,n
  public static int sum(int n) {
    if (n <= 0)
      return 0;
    else
      return n+sum(n-1);
  }
  
  // run method
  public static void main(String[] args) {
    int n = 6;
    int s = sum(n);
    System.out.printf("sum(0 to %d)=%d",n,s);
  }
}
