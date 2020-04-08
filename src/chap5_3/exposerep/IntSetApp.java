package chap5_3.exposerep;

import java.util.Vector;

public class IntSetApp {
  public static void main(String[] args) {
    Vector els = new Vector();
    els.add(1);
    els.add(2);

    IntSet iset = new IntSet(els);
    System.out.println(iset);
    
    // illegal modifications
    // remove
    els.remove(0);
    System.out.println("iset after remove(0): " + iset);

    // add
    Vector els1 = iset.getElements();
    els1.add(3);
    
    System.out.println("iset after add(3): " + iset);
  }
}
