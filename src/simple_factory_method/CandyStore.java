package simple_factory_method;

/**
 *
 * @author arnoldpaye
 */
public class CandyStore {
  public static void main(String[] args) {
    
  }
  
  public static Candy getCandy(String type) {
    switch (type) {
      case "hard candy":
        return new HardCandy();
      case "chocolate":
        return new Chocolate();
      default:
        return null;
    }
  }
}
