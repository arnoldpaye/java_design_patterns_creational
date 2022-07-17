package singleton_collections_example;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author arnoldpaye
 */
public class ResourceManager {
  
  public ResourceManager() {}
  
  public static void main(String[] args) {
    PrintSpooler spooler = new PrintSpooler();
    List<PrintSpooler> spoolers = Collections.singletonList(spooler);
    
    processResources(spoolers);
    
    PrintSpooler spooler2 = new PrintSpooler();
    
    // Add an item throws an error: "Exception in thread "main" java.lang.UnsupportedOperationException"
    spoolers.add(spooler2);
  }
  
  /**
   * A method that takes a list of resource managers as a parameter
   */
  public static <Type> void processResources(List<Type> list) {
    for (Type p: list) {
      // Code to process resources
    }
  }
}
