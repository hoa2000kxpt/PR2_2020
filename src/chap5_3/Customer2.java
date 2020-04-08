package chap5_3;

import java.util.Calendar;
import java.util.Date;

/**
 * @overview A class to demonstrate nesting.
 * @author dmle
 *
 */
public class Customer2 {
  private static int autoId = 1;
  private int id;
  private String name;
  private Date dob;  
  /** a derived attribute */
  private int age;
  
  private Address address;
  
  /**
   * An empty constructor used to clone objects
   * @effects 
   *  initialise this as Customer:<0,null,null>
   */
  private Customer2() {
    // do nothing
  }
  
  /**
   * @effects 
   *   initialise this as Customer:<id,name,dob>, where id = autoId
   *   update autoId
   *   invoke computeAge 
   */
  public Customer2(String name, Date dob) {
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
   * @effects 
   *  set address = Address:<number,street,district,cityOrTown,country>.
   */
  public void setAddress(int number, String street, String district, String cityOrTown, String country) {
    address = new Address(number, street, district, cityOrTown, country);    
  }
  
  /**
   * @effects 
   *  set address = Address:<number,s,d,c,o>, where 
   *  s = this.address.street, 
   *  d = this.address.district,
   *  c = this.address.cityOrTown,
   *  o = this.address.country 
   *
   */
  public void setAddressNumber(int number) {
    address.number = number;
    // BETTER design:
    // address.setNumber(number)
  }
  
  /**
   * @effects
   *  return address
   */
  public Address getAddress() {
    return address;
  }
  
  /**
   * @effects return age
   */
  public int getAge() {
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
      if (address != null) {
        sb.append(",").
        append(address);
      }
    } 
    sb.append(">");
    
    return sb.toString();
  }

  /**
   * @effects 
   *  return toString(true)
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
    
    Customer2 c = (Customer2) o;
    return (c.name.equals(name) && c.dob.equals(dob));
  }  
  
  /**
   * @overview Represents a customer address
   *  
   * @author dmle
   */
  public class Address {
    private int number;
    private String street;
    private String district;
    private String cityOrTown;
    private String country;
    
    public Address(int number, String street, String district, String cityOrTown, String country) {
      this.number = number;
      this.street = street;
      this.district = district;
      this.cityOrTown = cityOrTown;
      this.country = country;
    }
    
    public int getNumber() {
      return number;
    }
    
    public String getStreet() {
      return street;
    }
    
    public String getDistrict() {
      return district;
    }
    
    public String getCityOrTown() {
      return cityOrTown;
    }
    
    public String getCountry() {
      return country;
    }
    
    @Override
    public String toString() {
      StringBuffer sb = new StringBuffer("Address:<");
      sb.append(number).
      append(",").append(street).
      append(",").append(district).
      append(",").append(cityOrTown).
      append(",").append(country).
      append(">");
      
      return sb.toString();
    }
  } // end Address
}
