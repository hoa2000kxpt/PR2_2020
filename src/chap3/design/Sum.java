package chap3.design;

/*
import utils.TextIO;

*/
/**
 * @overview A program that computes the sum of real numbers that are obtained 
 *   from the user via the standard input
 * @author dmle
 *//*

*/
/*public class Sum {*//*


  */
/**
   * the main procedure
   * 
   * @effects 
   *  {@link #getNumbers()}: obtain some real numbers from the user  
   *  {@link #sum(float[])}: compute the sum of the numbers
   *  {@link TextIO#putln()}: print the sum
   *//*

  */
/*public static void main(String[] args)*//*


  */
/**
   * Determine the sum of array of real numbers
   * 
   * @requires a is not null
   * @effects return the sum of the array elements, i.e. result =
   *          a[0]+...+a[a.length-1]
   *//*

  */
/*private static float sum(float[] a)*//*


  */
/**
   * Obtain an array of real numbers from the user via keyboard.
   * 
   * @effects 
   *  prompt the user for the number of numbers needed
   *  initialise an array whose size is the specified number
   *  while array is not filled
   *    {@link #read()}: prompt the user to enter a new real number to add to the array
   *  return the array
   *//*

  */
/*private static float[] getNumbers()*//*


  */
/**
   * Read a real number from the user via keyboard
   * @effects 
   *  do 
   *    {@link TextIO#getlnFloat()}: prompt the user to enter a real number
   *  while input is invalid 
   *//*

*/
/*  private static float read()

*/
