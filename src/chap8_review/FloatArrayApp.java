package chap8_review;

public class FloatArrayApp {
  public static void main(String[] args) {
    // create a new object
    float[] a = {1.0f, 0f, -1.0f, 2.0f};
    FloatArray farr = new FloatArray(a);
    
    // print object
    System.out.println(farr);
    
    // use object (1)
    float s = farr.sum();
    
    System.out.println("sum: " + s);
    
    // use object (2)
    farr.getNumbers(5);
    System.out.println(farr);
    s = farr.sum();
    System.out.println("sum: " + s);
  }
}
