package chap5_3;

/**
 * @overview
 *  A simple class uses Customer and has only one instance. 
 * @author dmle
 */
public class CustomerApp3 {
  /** a single object of this class */
  private static CustomerApp3 instance;
  
  /**
   * @effects
   *  initialise this to be an empty object
   */
  private CustomerApp3() {
    //
  }
  
  /**
   * @effects
   *  if instance = null 
   *    initialise it 
   *  return instance  
   */
  public static CustomerApp3 getInstance() {
    if (instance == null) {
      instance = new CustomerApp3();
    }
    return instance;
  }
  
  /**
   * @effects
   *  initialise a customer object and display a report about it
   */
  public void run() {
    // use CustomerApp
    CustomerApp.main(new String[0]);
  }
  
  /**
   * The run method
   * @effects 
   *  initialise CustomerApp3 and run it
   */
  public static void main(String[] args) {
    CustomerApp3 app = CustomerApp3.getInstance();
    
    app.run();
  }
}
