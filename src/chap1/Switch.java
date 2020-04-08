package chap1;

public class Switch {
  public static void main(String[] args) {
    int n = 7;
    switch (n) { // (Assume n is an integer variable.)
      case 1:
        System.out.println("The number is 1.");
        break;
      case 2:
      case 4:
      case 8:
        System.out.println("The number is 2, 4, or 8.");
        System.out.println("(That's a power of 2!)");
        break;
      case 3:
      case 6:
      case 9:
        System.out.println("The number is 3, 6, or 9.");
        System.out.println("(That's a multiple of 3!)");
        break;
      case 5:
        System.out.println("The number is 5.");
        break;
      default:
        System.out.println("The number is 7 or is outside the range 1 to 9.");
    }
  }
  
  // a method to test switch statement with string value
  public static void switchString() {
    String s = "Wednesday";
    switch (s) { 
      case "Monday":
        System.out.println("Have a good week.");
        break;
      case "Tuesday":
      case "Wednesday":
      case "Thursday":
        System.out.println("Have a good day.");
        break;      
      case "Friday":
        System.out.println("Have a good week end.");
        break;      
      default:
        System.out.println("Which day is it?");
    }      
  }
}
