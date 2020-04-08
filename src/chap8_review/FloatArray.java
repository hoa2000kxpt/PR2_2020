package chap8_review;

import java.util.Arrays;

import utils.DomainConstraint;
import utils.TextIO;

/**
 * @overview Array is a sequence of real numbers
 * 
 * @attributes
 *  array   Float[]
 * 
 * @object
 *  A typical Array is [-1.0, 0, 1.0, 2.5,...].
 *  
 * @abstract_properties
 *  mutable(array)=true /\ optional(array)=false
 *   
 * @author dmle
 */
public class FloatArray {
  @DomainConstraint(type="Float[]",mutable=true,optional=false)
  private float[] array;
  
  /**
   * @effects
   *  if a is valid
   *    initialise as Array<a>
   *  else
   *    print error "Invalid input array"
   */
  public FloatArray(float[] a) {
    if (a != null) {
      // bad code: array = a;
      // good code: copy content
      array = new float[a.length];
      for (int i = 0; i < a.length; i++) {
        array[i] = a[i];
      }
    } else {
      System.err.println("Invalid input array");
    }
  }
  
  /**
   * determine the sum of array of real
   *   numbers
   * @requires array != null
   * @effects 
   *  if array != null
   *    return the sum of the array elements, i.e. result =
   *          array[0]+...+array[array.length-1]
   *  else
   *    return Float.NaN    
   */
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
  
  /**
   * @effects 
   *  obtain an array of n real numbers from keyboard input
   */  
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
  
  /**
   * Read a real number from the user
   * @effects returns a successfully read real number or
   *      Float.POSITIVE_INFINITY if failed to read 
   */
  private float read() {
    TextIO.putln("Enter next real number:");
    float num = TextIO.getlnFloat();
    return num;
  }
  
  @Override
  public String toString() {
    return Arrays.toString(array);
  }
  
  /**
   * @effects
   *  if this satisfies rep invariant
   *    return true
   *  else 
   *    return false
   */
  public boolean repOK() {
    if (array == null) {
      return false;
    } else {
      return true;
    }
  }
} // end FloatArray
