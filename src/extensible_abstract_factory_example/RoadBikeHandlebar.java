package extensible_abstract_factory_example;

/**
 *
 * @author arnoldpaye
 */
public class RoadBikeHandlebar extends Handlebar {

    private static String type = "DROP";

    @Override
    public void getDescription() {
        System.out.println("Road bike handlebar. Type: " + type);
    }

}
