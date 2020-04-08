package chap5_3;

/**
 * @overview Test object initialisation
 * @author dmle
 */
public class ObjectInit {
  private byte b;
  private char c;
  private short s;
  private int i;
  private long l;
  private float f;
  private double d;
  private Object o;

  // the run method
  public static void main(String[] args) {
    ObjectInit o = new ObjectInit();
    System.out.println("byte: " + o.b);
    System.out.printf("char: '%c' (%d)%n", o.c, (int) o.c);
    System.out.println("short: " + o.s);
    System.out.println("object: " + o.o);
  }
}
