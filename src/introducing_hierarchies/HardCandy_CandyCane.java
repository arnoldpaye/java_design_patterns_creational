package introducing_hierarchies;

import java.util.ArrayList;

/**
 *
 * @author arnoldpaye
 */
public class HardCandy_CandyCane extends Candy {

    @Override
    ArrayList<Candy> makeCandyPackage(int quantity) {
        ArrayList hardCandyPackage = new ArrayList<>();
        for (int i = 1; i <= quantity; i++) {
            HardCandy_CandyCane candyCane = new HardCandy_CandyCane();
            hardCandyPackage.add(candyCane);
        }

        System.out.println(quantity / 10 + " packages of 10 candy canes has been made!");
        return hardCandyPackage;
    }
}
