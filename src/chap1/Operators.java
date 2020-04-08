package chap1;

public class Operators {
  public static void main(String[] args) {   
    int b = 2; 
    int c = 13;
    int a = b + c;    // 15
    a = b * c;        // 26
    a = c - b;        // 11
    a = c / b;        // 6 (why?)
    char c1 = (char) (c * 5);    // A
    char c2 = (char) (c1 + 1); // B
    
    int r = (c % b);
    System.out.println(r);
    
    System.out.println(c1);
    System.out.println(c2);
    
    double d = 1d/2;
    System.out.println(d);
    
    System.out.printf("(a == b) = b is %b%n", ((a = b) == b));    
  }
  
  // a method to test the precedence rules
  public static void precedenceRule() {
    double e = 2d * 3 / 4;
    System.out.printf("2 * 3 / 4 = %.1f%n", e);
    
    // same result
    e = 2d / 4 * 3;
    System.out.printf("2 / 4 * 3 = %.1f%n", e);
    
    // same result
    int i = 2;
    e = 2d / 4 * ++i;
    System.out.printf("2 / 4 * ++i = %.1f%n", e);
  }
}
