package chap5_3;

import java.util.Calendar;
import java.util.Date;

/**
 * @effects 
 *  Represents a simple application that uses Customer.
 *   
 * @author dmle
 */
public class CustomerApp1 {
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
  }
}
