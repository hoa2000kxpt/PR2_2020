package chap3.implement2;

import java.util.Arrays;

import utils.TextIO;

/**
 * @overview A program that performs the coffee tin game.
 * 
 * @author dmle
 */
public class CoffeeTinGame {
  /** constant value for the green bean*/
  private static final char GREEN = 'G';
  /** constant value for the blue bean*/
  private static final char BLUE = 'B';
  /** constant for removed beans */
  private static final char REMOVED = '-';

 /**
  * the main procedure
  * @effects 
  *    initialise a coffee tin
  *    {@link TextIO#putf(String, Object...)}: print the tin content
  *    {@link @tinGame(char[])}: perform the coffee tin game on tin
  *    {@link TextIO#putf(String, Object...)}: print the tin content again
  *    if last bean is correct
  *      {@link TextIO#putf(String, Object...)}: print its colour 
  *    else
  *      {@link TextIO#putf(String, Object...)}: print an error message
  */
  public static void main(String[] args) {
    // initialise some beans
    char[] beans = { GREEN, BLUE, BLUE, GREEN, GREEN };

    // count number of greens
    int greens = 0;
    for (char b : beans) { 
      if (b == GREEN)
        greens++;
    }
    
    final char last = (greens % 2 == 1) ? GREEN : BLUE;
    // p0 = green parity /\ 
    // (p0=1 -> last=GREEN) /\ (p0=0 -> last=BLUE)
    
    // print the content of tin before the game
    TextIO.putf("tin before: %s %n", Arrays.toString(beans));

    // perform the game
    char lastBean = tinGame(beans);
    // lastBean = last \/ lastBean != last
    
    // print the content of tin and last bean
    TextIO.putf("tin after: %s %n", Arrays.toString(beans));
    
    // check if last bean as expected and print 
    if (lastBean == last) { 
      TextIO.putf("last bean: %c ", lastBean);      
    } else {
      TextIO.putf("Oops, wrong last bean: %c (expected: %c)%n",lastBean,last);
    }
  }

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
   *      i.e.  (p0 = 0 /\ one blue left) \/ 
   *            (p0 = 1 /\ one green left), where p0 = initial green parity
   *            </pre>
   */
  private static char tinGame(char[] tin) {    
    int bi1, bi2;
    int b1, b2;
    int count = tin.length;
    bi1 = 0;      
    while (count >= 2) {
      // remove b1, b2 from tin
      b1 = tin[bi1];          
      bi2 = bi1+1;            
      b2 = tin[bi2];          
      tin[bi1] = REMOVED; 
      tin[bi2] = REMOVED;     
      if (b1 == BLUE && b2 == BLUE) { 
        // put B in bin
        tin[bi2] = BLUE;      
      } else if (b1 == GREEN && b2 == GREEN) { 
        // put B in bin
        tin[bi2] = BLUE;      
      } else { // BG, GB    
        // put G in bin
        tin[bi2] = GREEN;   
      }
      count = count-1;
      bi1 = bi1+1;          
    }
    
    return tin[bi1];
  }
}
