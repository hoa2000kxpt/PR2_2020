package chap2;

class HelloSub extends Hello {
  private String mesg;
  
  public HelloSub() {
    super();
    mesg = "hello";
  }
  
  public static void main(String args[]) {
    System.out.println("Hello, world!");
  }
}