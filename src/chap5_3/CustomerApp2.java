package chap5_3;

import java.util.Calendar;
import java.util.Date;

/**
 * @effects 
 *  A simple application that uses Customer2.
 * @author dmle
 *
 */
public class CustomerApp2 {
  /**
   * The run method
   * @effects 
   *  instantiate a Customer object and invoke its operations to test.
   */
  public static void main(String[] args) {
    Calendar cal = Calendar.getInstance();
    cal.set(1970,0,2);
    Date date = cal.getTime();
    Customer2 cust = new Customer2("Duc Le", date);
    
    System.out.println(cust);
    
    // address
    cust.setAddress(3, "Ly Thuong Kiet", "Dong Da", "Hanoi", "Vietnam");
    System.out.println(cust);
    System.out.println("house number: " + cust.getAddress().getNumber());
    
    // change address one more time
    cust.setAddressNumber(5);
//    cust.setAddress(5, cust.getAddress().getStreet(), 
//                       cust.getAddress().getDistrict(), 
//                       cust.getAddress().getCityOrTown(),
//                       cust.getAddress().getCountry());
    System.out.println("NEW house number: " + cust.getAddress().getNumber());
    
    
    
    
    
  }
}
