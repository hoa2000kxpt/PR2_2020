package chap2;

import utils.TextIO;

public class Gcd {

  // returns the greatest common divisor of x and y
  // Euclid by repeated subtraction
  public static void main(String[] args) {
	int i = TextIO.getInt(), j = TextIO.getInt();
    while (i != j) {
      if (i > j)
        i = i - j;
      else
        j = j - i;
    }

    TextIO.putln(i);
  }   
}
