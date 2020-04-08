package chap1;

import static utils.TextIO.*;

public class MultiVarCountLoop {

  public static void main(String[] args) {
    // print two columns of numbers
    for (int i = 1, j = 10; i <= 10; i++, j--) {
      putf("%5d", i);
      putf("%5d%n", j);
    }
  } // end main()

} // end class MultiVarCountLoop
