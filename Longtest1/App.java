import Locations.*;
import Me.*;

public class App {
    public static void main(String[] args) {
        
        Location boracay = new Boracay();
        Location palawan = new Palawan();
        Location albay = new Albay();
        Location batangas = new Batangas();
        Location elyu = new Elyu();

        Tourist rodney = new Myself();

        elyu.accept(rodney);
        boracay.accept(rodney);
        batangas.accept(rodney);
        albay.accept(rodney);
        palawan.accept(rodney);
        batangas.accept(rodney);
        albay.accept(rodney);
        palawan.accept(rodney);

    }
}
