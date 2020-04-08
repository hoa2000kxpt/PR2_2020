package chap6.test.tree;

import chap6.tree.topdown.Tree;

public class TopDownTreeTest {
  public static void main(String[] args) {
    
    Object n1 = new Integer(1);
    Object n2 = new Integer(2);
    Object n3 = new Integer(3);
    Object n4 = new Integer(4);
    Object n5 = new Integer(5);
    Object n6 = new Integer(6);
    Object n7 = new Integer(7);
    Object n8 = new Integer(8);
    Object n9 = new Integer(9);
    Object n10 = new Integer(10);
    Object n11 = new Integer(11);
    Object n12 = new Integer(12);

    Tree t = new Tree(n1);

    System.out.printf("tree(1): %n%s%n%n",t);
    
    boolean aok = false;
    aok = t.addNode(n1,n2);
    System.out.printf("addNode(1,2): %b%n",aok);
    
    t.addNode(n2,n3);
    t.addNode(n2,n6);

    System.out.printf("after adding 2, 3, 6: %n%s%n%n",t);
    
    t.addNode(n1,n10);
    t.addNode(n10,n11);
    t.addNode(n10,n12);

    t.addNode(n3,n4);
    t.addNode(n3,n5);

    t.addNode(n6,n7);
    
    t.addNode(n7,n8);
    t.addNode(n7,n9);
    
    

    boolean repOk = t.repOK();   
    if (repOk)
      System.out.printf("complete tree: %n%s%n%n",t);

    System.out.println("valid: " + repOk);

  }
}
