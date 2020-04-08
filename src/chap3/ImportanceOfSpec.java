package chap3;



public class ImportanceOfSpec {

  // what does this do?
  public static int compute1(int x, int y) {
    int result;
    if (x >= y)     
      result = x;      
    else            
      result = y;      
    return result;
  }
  
  // what does this do?
  public static int compute2(int x, int y) {
    int result;
    result = (x >= y) ? x : y;
    return result;
  }
  
  // what does this do?
  public static int compute3(int x, int y, int z) {
    int result;

    if (x >= y) {     
      if (y >= z || x >= z) {
        result = x;      
      } else {        
        result = z;      
      }
    } else {          
      if (y >= z) {
        result = y;      
      } else {        
        result = z;      
      }
    }
    
    return result;
  }

  // what does this do?
  public static int compute4(int x, int y, int z) {
    int result;

    result = 
        (x >= y) 
            ? ((y >= z || x >= z) ? x : z) 
            : ((y >= z) ? y : z);
    
    return result;
  }

  public static void main(String[] args) {
      int x = 2, y=10, z=-1;      
      System.out.printf("compute3(%d,%d,%d)=%d%n", x, y, z, compute3(x,y,z));
      System.out.printf("compute4(%d,%d,%d)=%d%n", x, y, z, compute4(x,y,z));
  }
}
