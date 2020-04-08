package intro;

// another program that displays "hello world" on the standard console
public class Greeting2 {
  // object variable
  int counter;
  
  // the main method
  // displays "hello world" on the standard console
  public static void main(String[] args) {
    System.out.println("hello world!");
  } // end main
  
  // returns a greeting message containing name.
  String getGreeting(String name) {
    return "hello " + name;
  }

  // count the number of greetings 
  int countGreetings() {
    counter = counter + 1;
    return counter; 
  }  
} // end Greeting2
