package chap1;

import static utils.TextIO.putf;
public class ForEachLoop1 {
  public static void main(String[] args) {
    String[] seasons = {"SPRING", "SUMMER", "FALL", "WINTER"};
    int idx = 0;
    for (String s: seasons) {
      putf("%s is a season number %d%n", s, idx);
      idx++;
    }
  }
}
