package chap5_3;

import java.util.Date;

/**
 * @overview
 *  A factory class to create Customer objects
 * @author dmle
 */
public class CustomerFactory {
  /**
   * Prevent instances of this factory from being created outside of this class  
   */
  private CustomerFactory() {
    // 
  }
  
  /**
   * Create a new customer instance.
   * 
   * @effects
   *  return object Customer:<name,dob>
   */
  public static Customer createCustomer(String name, Date dob) {
    Customer cust = new Customer(name, dob);
    /* better code:
    if (cust.repOK()) {
      // cust is valid
      return cust;
    } else {
      return null;
    }
    */
    return cust;
  }
}
