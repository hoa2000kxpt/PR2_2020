package chap1;

import static utils.TextIO.*;

/**
 * This program reads a line of text entered by the user.
 * It prints a list of the letters that occur in the text,
 * and it reports how many different letters were found.
 */

public class ListLetters2 {

  public static void main(String[] args) {
    
    String str = getString();
    
    str = str.toUpperCase();  

    processString(str);
    
  } // end main()
  
  // get a string input from the user 
  private static String getString() {
    String str; // Line of text entered by the user.
    putln("Please type in a line of text.");
    str = getln();
    return str;
  }

  // process the user string to find characters and print them in order
  private static void processString(String str) {
    int count; // Number of different letters found in str.
    char letter; // A letter of the alphabet.
    count = 0;

    putf("Your input contains the following letters:%n%4s","");
    for (letter = 'A'; letter <= 'Z'; letter++) {
      int i; // Position of a character in str.
      for (i = 0; i < str.length(); i++) {
        if (letter == str.charAt(i)) {
          putf("%-2s",letter);  // left-justified, width 2
          count++;
          break;
        }
      }
    }

    putln();
    putln();
    putln("There were " + count + " different letters.");
  }
} // end class ListLetters
