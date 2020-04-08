package chap3.raw;

import utils.TextIO;

public class Sum {
  // the main procedure
  public static void main(String[] args) {
    float s = 0;
    float[] r = getNumbers();

    if (r != null)         
      s = sum(r);          
    TextIO.putln("sum = " + s);
  }

  // compute the sum of real numbers
  private static float sum(float[] a) {
    int n = 0;
    float s = 0;
    while (n < a.length) {  
      s = s + a[n];         
      n++;			 
  }
  return s;
 }

  // obtain real numbers from the user 
  private static float[] getNumbers() {
    // ask user for how many numbers she needs
    TextIO.putln("How many numbers do you need?");
    int count = TextIO.getlnInt();
    while (count < 0) {
      TextIO.putln("Invalid number: " + count + ". Please reenter.");
      count = TextIO.getlnInt();
    }
    
    float[] a = new float[count];
    int i = 0;
    float f = read();
    while (i < count-1 && f != Float.POSITIVE_INFINITY) {
      a[i] = f;    
      i++;
      f = read(); 
    }
    if (f != Float.POSITIVE_INFINITY)
      a[count-1] = f;
    
    if (a.length < count)
      return null;  
    else             
      return a;      
  }

  // read a number from the user
  private static float read() {
    TextIO.putln("Enter next real number:");
    float num = TextIO.getlnFloat();
    return num;
  }
}
