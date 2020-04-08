package chap4.recfunc;

// a program that computes the factorial of a number using recursion
public class Fact {
  
  // computes the factorial of n
  public static long fact (int n) {
    if (n <= 1)
      return 1;
    else
      return n*fact(n-1);
  }
  
  // run method
  public static void main(String[] args) {
    int n = 6;
    long f = fact(n);
    System.out.printf("fact(1 to %d)=%d",n,f);
  }
}
