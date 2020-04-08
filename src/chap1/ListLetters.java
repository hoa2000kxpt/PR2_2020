package chap1;

import static utils.TextIO.*;

/**
 * This program reads a line of text entered by the user.
 * It prints a list of the letters that occur in the text,
 * and it reports how many different letters were found.
 */

public class ListLetters {

  public static void main(String[] args) {

    String str; // Line of text entered by the user.
    int count; // Number of different letters found in str.
    char letter; // A letter of the alphabet.
    count = 0;

    putln("Please type in a line of text.");
    str = getln();
    str = str.toUpperCase();

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

  } // end main()

} // end class ListLetters
