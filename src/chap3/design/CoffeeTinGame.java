package chap3.design;

import utils.TextIO;

/**
 * @overview A program that performs the coffee tin game.
 * @author dmle
 */
public class CoffeeTinGame {
  
 /**
  * the main procedure
  * @effects 
  *    initialise a coffee tin
  *    {@link TextIO#putf(String, Object...)}: print the tin content
  *    {@link #tinGame(char[])}: perform the coffee tin game on tin
  *    {@link TextIO#putf(String, Object...)}: print the tin content again
  *    if last bean is correct
  *      {@link TextIO#putf(String, Object...)}: print its colour 
  *    else
  *      {@link TextIO#putf(String, Object...)}: print an error message
  */
  /*public static void main(String[] args)*/

  /**
   * Performs the coffee tin game to determine the colour of the last bean
   * 
   * @requires tin is not null /\ tin.length > 0
   * @modifies tin
   * @effects <pre>
   *          repeatedly remove two beans from tin and update tin as follows
   *          if are same colour
   *             throw both away, put one blue bean back
   *          else
   *             put green bean back
   *          if the number of green beans is even
   *            return blue
   *          else
   *            return green
   *            
   *      i.e. (p0 = 0 /\ one blue left) \/ 
   *           (p0 = 1 /\ one green left), 
   *           where p0 = initial green bean parity
   *           
   *           if p0 = 1 
   *            result = 'G'
   *           else 
   *            result = 'B' 
   *   </pre>
   */   
  /*private static char tinGame(char[] tin)  */
  
}
