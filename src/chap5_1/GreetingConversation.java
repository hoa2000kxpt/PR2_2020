package chap5_1;

/**
 * @overview Represents greeting conversations between of two persons.
 * @author dmle
 *
 */
public class GreetingConversation {
  
  /** 
   * @effects Create two persons and make them greet each other
   */
  public void greet() {
    Person person1 = new Person("Duc");
    person1.setName("Duc le");
    Person person2 = new Person("Nam");
    
    // objects say hello to each other
    person1.greet();
    person2.greet();        
  }
  
  /**
   * The main method
   * 
   * @effects Create a greeting conversation between two persons 
   */
  public static void main(String[] args) {
    // creates a greeting conversation
    GreetingConversation gc = new GreetingConversation();
    gc.greet();
  }
} // end GreetingConversation