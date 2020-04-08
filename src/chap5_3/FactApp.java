package chap5_3;

public class FactApp {
  public static void main(String[] args) {
    int n = 7;
    Fact f = new Fact(n);
    
    // also use other intermediate factorial objects here!
    
    System.out.println(n+"! = " + f.getValue());
  }
}
