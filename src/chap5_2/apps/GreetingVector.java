package chap5_2.apps;

import java.util.Vector;

import chap5_1.Person;

/**
 * @overview Displays greeting messages of a set of persons
 * @author dmle
 *
 */
public class GreetingVector {
  /**
   * The main method
   * 
   * @effects creates an array of persons and prints their greetings
   */
  public static void main(String[] args) {
    // creates an array of greeting objects    
    Vector persons = new Vector();
    for (int i = 0; i < 10; i++) {
      Person p = new Person("P"+i); //nanoTime();      
      persons.add(p);
    }
    
    // display greeting messages
    for (int i = 0; i < 10; i++) {
      Person p = (Person) persons.get(i);
      p.greet();
    }
  } // end main  
} // end GreetingArray