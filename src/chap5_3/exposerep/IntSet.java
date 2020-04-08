package chap5_3.exposerep;

import java.util.Vector;

public class IntSet {
  private Vector elements;    

  public IntSet(Vector els) {
    elements = els;
  }

  public Vector getElements() {
    return elements;
  }
  
  @Override
  public String toString() {
    if (elements != null) {
      return elements.toString();
    } else {
      return "IntSet<null>";
    }
  }
}