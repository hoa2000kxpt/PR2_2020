package chap1;

import static utils.TextIO.*;

public class ForEachLoop2 {
  static enum Season { 
    SPRING,
    SUMMER,
    FALL, 
    WINTER}

  public static void main(String[] args) {
    int idx;
    for (Season s: Season.values()) {
      idx = s.ordinal();
      putf("%s is a season number %d%n", s, idx);
    }
  }
}
