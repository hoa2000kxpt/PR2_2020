package chap5_3;

public class StackAndHeap {
  public void fig1() {
    int i = 6;
    int j;  // uninitialised
    int[] a = {1,3,5,7,9};  // creates a 5-element array
    int[] b = new int[3];
    String s = "hello";    // creates a new string
    String t = null;
  }
  
  public void fig2() {
    int i = 6;
    int j;  // uninitialised
    int[] a = {1,3,5,7,9};  // creates a 5-element array
    int[] b = new int[3];
    String s = "hello";    // creates a new string
    String t = null;

    j = i;
    b = a;
    t = s;
  }
}
