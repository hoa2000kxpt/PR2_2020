package chap5_3;

import java.util.Calendar;
import java.util.Date;

/**
 * @overview Represent customers...
 * @author dmle
 */
public class Customer {
  private static int autoId = 1;
  private int id;
  private String name;
  private Date dob;  
  /** a derived attribute */
  private int age;
  
  /**
   * An empty constructor used to clone objects
   * @effects 
   *  initialise this as Customer:<0,null,null>
   */
  private Customer() {
    // do nothing
  }
  
  /**
   * @effects 
   *   initialise this as Customer:<id,name,dob>, where id = autoId
   *   update autoId
   *   invoke computeAge 
   */
  public Customer(String name, Date dob) {
    this.id = autoId;
    this.name = name;
    this.dob=dob;
    
    autoId++;
    
    computeAge();
  }
  
  /**
   * @requires dob != null
   * @effects 
   *  set age = currentYear - year(dob)
   */
  private void computeAge() {
    Calendar cal = Calendar.getInstance();
    int currYear = cal.get(Calendar.YEAR);
    cal.setTime(dob);
    int yob = cal.get(Calendar.YEAR);
    
    age = currYear - yob;
  }
  
  /**
   * @effects return age
   */
  public int getAge() {
    // should not need to invoke computeAge() here!!!!
    return age;
  }
  
  /**
   * @effects 
   *  return id
   */
  public int getId() {
    return id;
  }
  
  /**
   * @effects
   *  return name
   */
  public String getName() {
    return name;
  }
  
  /**
   * @effects return dob
   */
  public Date getDob() {
    return dob;
  }
  
  /**
   * @effects 
   *  if full = true
   *    return Customer:<id,name,dob>
   *  else
   *    return Customer:<id,name>
   */
  public String toString(boolean full) {
    StringBuffer sb = new StringBuffer();
    sb.append("Customer:<").
    append(id).append(",").
    append(name);
    if (full) {
      sb.append(",").
      append(dob);
    } 
    sb.append(">");
    
    return sb.toString();
  }

  /**
   * @effects 
   *  return Customer:<id,name,dob>
   */
  @Override
  public String toString() {
    return toString(true);
  }
  
  @Override
  public boolean equals(Object o) {
    if (o == null)
      return false;
    
    if (o.getClass() != this.getClass()) 
      return false;
    
    Customer c = (Customer) o;
    return (c.name.equals(name) && c.dob.equals(dob));
  }
  
  /**
   * @effects 
   *  return a deep copy of this, i.e. Customer<i,n,d>, where
   *  i = id, n = new String(name), d = dob.clone()
   */
  @Override
  public Customer clone() {
    // different object but same class
    Customer c = new Customer();

    // same content with deep copy
    // copy value
    c.id = id;
    // clone string value
    c.name = new String(name);
    // clone dob
    c.dob = (Date) dob.clone();
    
    return c;
  }  
}
