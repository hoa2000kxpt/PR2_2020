package chap5_2;

import utils.AttrRef;
import utils.DOpt;
import utils.DomainConstraint;
import utils.OptType;

/**
 * @overview Customers are people or organisations with which we have
 *           relationships.
 * @attributes 
 *   id    Integer  
 *   name  String   
 * @object A typical Customer is c=<d,n>, where id(d), name(n).
 * @abstract_properties
 *   mutable(id)=false /\ optional(id)=false /\ min(id)=1 /\ 
 *   mutable(name)=true /\ optional(name)=false /\ length(name)=50
 * @author dmle
 */
public class Customer {
  @DomainConstraint(type = "Integer", mutable = false, optional = false, min = MIN_ID)
  private int id;

  @DomainConstraint(type = "String", optional = false, length = LENGTH_NAME)
  private String name;

  // constants
  private static final int MIN_ID = 1;
  private static final int LENGTH_NAME = 50;

  // constructor methods
  /**
   * @effects <pre> 
   *  if custID, name are valid
   *    initialise this as <custID,name>
   *  else
   *    initialise this as <> and inform error</pre>
   */
  public Customer(@AttrRef("id") int custID, @AttrRef("name") String name) {
    if (!validateId(custID)) {
      System.err.println("Invalid customer id: " + custID);
      return;
    }
    
    if (!validateName(name)) {
      System.err.println("Invalid customer name: " + name);
      return;
    }
    
    id = custID;
    this.name = name;
  }

  /**
   * @effects <pre>
   *   if name is valid
   *     set this.name=name
   *     return true
   *   else
   *     return false</pre>
   */
  @DOpt(type=OptType.Mutator) @AttrRef("name")
  public boolean setName(String name) {
    if (validateName(name)) {
      this.name = name;
      return true;
    } else {
      return false;
    }
  }

  /**
   * @effects return <tt>id</tt>
   */
  @DOpt(type=OptType.Observer) @AttrRef("id")
  public int getId() {
    return id;
  }

  /**
   * 
   * @effects return <tt>name</tt>
   */
  @DOpt(type=OptType.Observer) @AttrRef("name")  
  public String getName() {
    return name;
  }

  /**
   * @effects <pre>
   *  if id is valid 
   *    return true 
   *  else
   *    return false
   *  </pre>
   */
  private boolean validateId(int id) {
    return id >= MIN_ID;
  }

  /**
   * @effects <pre>
   *   if name is valid 
   *     return true
   *   else 
   *     return false</pre>
   */
  private boolean validateName(String name) {
    return (name != null && name.length() > 0 && name.length() <= LENGTH_NAME);
  }  

  @Override
  public String toString() {
    return "Customer:<" + id + "," + name + ">";
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof Customer))
      return false;

    int yourID = ((Customer) o).id;
    return yourID == id;
  }

  /**
   * @effects <pre>
   *   if this satisfies abstract properties
   *     return true 
   *   else
   *     return false</pre>
   */
  public boolean repOK() {
    return validateId(id) && validateName(name);
  }
}
