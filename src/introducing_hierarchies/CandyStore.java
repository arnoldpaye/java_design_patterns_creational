package introducing_hierarchies;

/**
 *
 * @author arnoldpaye
 */
public class CandyStore {
    
  private static final CandyFactory chocolateFactory = new ChocolateFactory();
  private static final CandyFactory hardCandyFactory = new HardCandyFactory();
  
  public static void main(String[] args) {
    chocolateFactory.getCandyPackage(7, "dark");
    hardCandyFactory.getCandyPackage(14, "lollipop");
    hardCandyFactory.getCandyPackage(50, "candycane");
  }
}
