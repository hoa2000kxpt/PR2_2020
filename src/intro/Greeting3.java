package intro;

//another program that displays "hello world" with a given name 
// on the standard console
public class Greeting3 {  
  // the main method
  // displays "hello world" with a given name on the standard console
  public static void main(String[] args) {
    // creates a Greeting object and invoke its method to
    Greeting3 greet = new Greeting3();
    String s = greet.getGreeting("Duc");
    System.out.println(s);    
  } // end main
  
  // Returns a greeting message containing name.
  String getGreeting(String name) {
    return "hello " + name;
  }
} // end Greeting3
