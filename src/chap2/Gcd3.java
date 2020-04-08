package chap2;

import utils.TextIO;

public class Gcd3 {

	public static void gcd(int i, int j) throws IllegalArgumentException {
	  if (i < 0 || j < 0) throw new IllegalArgumentException("Gcd.gcd: (i,j)=("+i+","+j+")");
	  while (i != j) {
	    if (i > j) i = i - j;
		else j = j - i;
      }
	  TextIO.putln(i);
	}
	
	public static void main(String[] args) {
		gcd(2,3);
	}
}
