package chap5_1;

/**
 * @overview Displays greeting messages of a set of persons
 * @author dmle
 *
 */
public class GreetingArray {
  /**
   * The main method
   * 
   * @effects creates an array of persons and prints their greetings
   */
  public static void main(String[] args) {
    // creates an array of greeting objects    
    Person[] persons = new Person[10];
    for (int i = 0; i < 10; i++) {
      Person p = new Person("P"+i); //nanoTime();      
      persons[i] = p;
    }
    
    // display greeting messages
    for (int i = 0; i < 10; i++) {
      Person p = persons[i];
      p.greet();
    }
  } // end main  
} // end GreetingArray