package chap2;

public class Gcd2 {

  // returns the greatest common divisor of x and y
  // Euclid by repeated subtraction
  public static int gcd(int x, int y) {
    while (x != y) {
      if (x > y)
        x = x - y;
      else
        y = y - x;
    }

    return x;
  } 
  
  public static void main(String[] args) {
    int x = 100, y = 4;
    
    System.out.printf("gcd(%d,%d) = %d%n", x, y, gcd(x,y));
  }
}
