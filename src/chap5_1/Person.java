package chap5_1;

/**
 * @overview Represents persons with a name attribute.
 * @author dmle
 */
public class Person {
  private String name;

  /**
   * @effects initialise this as an object whose name is aName
   */
  public Person(String aName) {
    name = aName;
  }
  
  /**
   * @effects updates name with newName
   */
  public void setName(String newName) {
    name = newName;
  }
  
  /**
   * @effects Prints a greeting message containing name to 
   *          the standard console
   */
  public void greet() {
    System.out.println("hello, my name is " + name);
  }
}
