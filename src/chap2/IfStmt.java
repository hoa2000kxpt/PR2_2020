package chap2;

public class IfStmt {
  public static void main(String[] args) {
    int hour = 13;
    String name = "Duc";
    if (hour < 12) 
      if (hour >= 6) 
        System.out.println(hour+ "AM: Good morning " + name); // short-if
    else 
      System.out.println("Good afternoon | evening " + name);
  }
}
