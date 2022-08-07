
package extensible_abstract_factory_example;

/**
 *
 * @author arnoldpaye
 */
public abstract class BikeFactory {           
    
    abstract BikePart create(String type);
    
}
