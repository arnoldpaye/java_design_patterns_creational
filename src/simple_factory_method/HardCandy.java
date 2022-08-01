package simple_factory_method;

import java.util.ArrayList;

/**
 *
 * @author arnoldpaye
 */
public class HardCandy extends Candy {
  @Override
  ArrayList<Candy> makeCandyPackage(int quantity) {
    ArrayList hardCandyPackage = new ArrayList<>();
    for (int i = 1; i <= quantity; i++) {
      HardCandy hardCandy = new HardCandy();
      hardCandyPackage.add(hardCandy);
    }
    
    System.out.println("One package of " + quantity + " hard candies has been made!");
    return hardCandyPackage;
  }
}
