package chap5_3;

import java.util.Calendar;
import java.util.Date;

/**
 * @effects 
 *  Represents a simple application that uses Customer.
 *   
 * @author dmle
 */
public class CustomerApp {
  /**
   * @requires c neq null
   * @effects 
   *  generate and display to the terminal console a formatted report about c
   */
  private static void report(Customer c) {
    StringBuffer rept = new StringBuffer();
    Date d = c.getDob();
    Calendar cal = Calendar.getInstance();
    cal.setTime(d);
    String dstr = cal.get(Calendar.DATE) + "/" + 
    (cal.get(Calendar.MONTH)+1) + "/" + 
        cal.get(Calendar.YEAR);
    
    rept.append("       CUSTOMER REPORT      ").append("\n");
    
    final String idf = "%3s";
    final String namef = "%10s";
    final String dobf = "%15s";
    // report fields
    rept.append(String.format(idf,"id")).
    append(String.format(namef,"name")).
    append(String.format(dobf,"date of birth")).append("\n");
    // report values
    rept.append(String.format(idf,c.getId())).
    append(String.format(namef,c.getName())).
    append(String.format(dobf,dstr));
    
    System.out.println(rept.toString());
  }
  
  /**
   * The run method
   * @effects 
   *  instantiate a Customer object and invoke its operations to test.
   */
  public static void main(String[] args) {
    Calendar cal = Calendar.getInstance();
    cal.set(1970,0,2);
    Date date = cal.getTime();
    Customer cust = new Customer("Duc Le", date);
    
    System.out.println(cust);
    System.out.println(cust.toString(false));
    System.out.println("age: " + cust.getAge());
    
    // clone
    Customer cc = cust.clone();
    
    System.out.printf("its clone: %s%n", cc);
    
    // test result
    System.out.printf("same class?: %b%n", (cust.getClass() == cc.getClass()));
    System.out.printf("same object?: %b%n", (cust == cc));
    System.out.printf("equals?: %b%n", cust.equals(cc));
    System.out.printf("same name?: %b%n", (cust.getName()==cc.getName()));
    System.out.printf("name equals?: %b%n", (cust.getName().equals(cc.getName())));
    System.out.printf("same date?: %b%n", (cust.getDob()==cc.getDob()));
    System.out.printf("date equals?: %b%n", (cust.getDob().equals(cc.getDob())));
    
    // report
    report(cust);
  }
}
