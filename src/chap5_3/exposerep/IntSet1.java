package chap5_3.exposerep;

import java.util.Vector;

public class IntSet1 {
  private Vector elements;    

  /**
   * @effects initialise this to contain same  
   *    elements as els
   */
  public IntSet1(Vector els) {
    elements = new Vector();
    for (Object o : els) {
      elements.add(o);
    }
  }

  /**
   * @effects initialise this to contain same  
   *    elements as els
   */
  public IntSet1(Object[] els) {
    elements = new Vector();
    for (Object o : els) {
      elements.add(o);
    }
  }

  public Object[] getElements() {
    if (elements.size() == 0) {
      return null;
    } else {
      Object[] els = new Object[elements.size()];
      for (int i = 0; i < elements.size(); i++) {
        els[i] = elements.get(i);
      }
      return els;
    }
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