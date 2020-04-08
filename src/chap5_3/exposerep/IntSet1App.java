package chap5_3.exposerep;

import java.util.Vector;

public class IntSet1App {
  public static void main(String[] args) {
    Vector els = new Vector();
    els.add(1);
    els.add(2);

    IntSet1 iset = new IntSet1(els);
    System.out.println(iset);
    
    // modifications without affecting set
    els.remove(0);
    System.out.println("iset after els.remove(0): " + iset);
    
    Object[] els1 = iset.getElements();
    els1[0] = 3;
    System.out.println("iset after els1[0]=3: " + iset);
    
  }
}
