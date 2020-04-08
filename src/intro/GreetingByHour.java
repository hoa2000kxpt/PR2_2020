package intro;
import static utils.System.*;

// a program that displays a greeting message based on the hour of the day
public class GreetingByHour {
  
  // the main method
  public static void main(String[] args) {
    // prints a greeting message to the standard output console
    String user = getUserName();
    String greeting = getGreeting(user);
    System.out.println(greeting);
  } // end main
  
  // returns a suitable greeting message containing name, 
  // based on the hour of the day
  public static String getGreeting(String name) {
    // hour of the day
    int hour = getHourOfDay();
    
    if (hour < 12) {
      return "Good morning " + name;
    } else if (hour >= 12 && hour < 18) {
      return "Good afternoon " + name;
    } else {
      return "Good evening " + name;
    }
  }
} // end GreetingByHour
