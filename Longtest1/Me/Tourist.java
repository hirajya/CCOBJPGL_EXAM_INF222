package Me;

import Locations.*;

public interface Tourist {
    
    int budget = 0;

    void visit(Boracay boracay);

    void visit(Batangas batangas);

    void visit(Elyu elyu);

    void visit(Palawan palawan);

    void visit(Albay albay);

    default void visit(Location location) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
}
