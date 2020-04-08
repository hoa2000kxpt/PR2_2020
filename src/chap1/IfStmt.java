package chap1;

public class IfStmt {
  public static void main(String[] args) {
    int hour = 17;
    String name = "Duc";
    if (hour < 12) {
      System.out.println("Good morning " + name);
    } else if (hour >= 12 && hour < 18) {
      System.out.println("Good afternoon " + name);
    } else {
      System.out.println("Good evening " + name);
    }
  }
}
