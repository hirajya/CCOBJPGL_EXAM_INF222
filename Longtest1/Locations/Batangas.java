package Locations;

import Me.Tourist;

public class Batangas implements Location{
    
    int airFare = 200;

    public int getAirFare() {
        return airFare; 
    }

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}
