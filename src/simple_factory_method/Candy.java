package simple_factory_method;

import java.util.ArrayList;

/**
 *
 * @author arnoldpaye
 */
public abstract class Candy {
  abstract ArrayList<Candy> makeCandyPackage(int quantity);
}
