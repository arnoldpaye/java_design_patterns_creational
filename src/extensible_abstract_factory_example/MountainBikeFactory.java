
package extensible_abstract_factory_example;

/**
 *
 * @author arnoldpaye
 */
public class MountainBikeFactory extends BikeFactory {
    
    @Override
    public BikePart create(String type) {
        if (type.equalsIgnoreCase("tire")) {
            return new MountainBikeTire();
        } else if (type.equalsIgnoreCase("handlebar")) {
            return new MountainBikeHandlebar();
        } else {
            return null;
        }
    }
    
}
