package chap1;

public class Blocks {
  public static void main(String[] args) {
    String ans = "to be or not to be";
    {
      System.out.print("The answer is ");
      System.out.println(ans);
    }

    int x = 2;
    int y = 3;
    { // This block exchanges the values of x and y
      int temp; // A temporary variable for use in this block.
      temp = x; // Save a copy of the value of x in temp.
      x = y; // Copy the value of y into x.
      y = temp; // Copy the value of temp into y.
    }
  }
}
