
package abstract_factory_example;

/**
 *
 * @author arnoldpaye
 */
public class RoadBikeFactory extends BikeFactory {
    
    @Override
    public Tire createTire() {
        return new RoadBikeTire();
    }
    
    @Override
    public Handlebar createHandlebar() {
        return new RoadBikeHandlebar();
    }
    
}
