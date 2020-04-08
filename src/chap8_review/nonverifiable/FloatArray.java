package chap8_review.nonverifiable;

import java.util.Arrays;

import utils.TextIO;

/**
 * @author dmle
 */
public class FloatArray {
  private float[] array;
  
  public FloatArray(float[] a) {
    if (a != null)
      array = a;
    else
      System.err.println("Invalid input array");
  }
  
  public float sum() {
    if (array != null) {
      int n = 0;
      float s = 0;
      while (n < array.length) {  
        s = s + array[n];  
        n++;           
      }
      return s;
    } else {
      return Float.NaN;
    }
  }
  
  public void getNumbers(int n) {
    array = new float[n];
    int i = 0;
    float f = read();
    while (i < array.length-1 && f != Float.POSITIVE_INFINITY) {
      array[i++] = f;     
      f = read();     
    }
    array[i]=f;
  }
  
  private float read() {
    TextIO.putln("Enter next real number:");
    float num = TextIO.getlnFloat();
    return num;
  }
  
  public String toString() {
    return Arrays.toString(array);
  }
  
  public boolean repOK() {
    if (array == null) {
      return false;
    } else {
      return true;
    }
  }
} // end FloatArray
