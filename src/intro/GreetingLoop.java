package intro;
import static intro.GreetingByHour.*;
import static utils.System.*;

// a program that displays a greeting message and a sequence of numbers
public class GreetingLoop {
  // The main method
  public static void main(String[] args) {
    String user = getUserName();
    String greeting = getGreeting(user);
    System.out.println(greeting);
    for (int j = 0; j < 5; j++) {
      System.out.println(j+1);
    }
  } // end main  
} // end Greeting
