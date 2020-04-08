package chap5_1;

import utils.TextIO;

/**
 * @overview A program that displays greeting messages from two persons.
 * @author dmle
 */
public class GreetingConversationProc {
  public static void main(String[] args) {
    System.out.println("Enter first person's name:");
    String name1 = TextIO.getln();
    System.out.println("Enter second person's name:");
    String name2 = TextIO.getln();
    
    greet(name1);
    greet(name2);
  }

  /**
   * @effects display the greeting message "Hello, may name is " + name
   */
  private static void greet(String name) {
    System.out.println("Hello, my name is " + name);
  }
}
