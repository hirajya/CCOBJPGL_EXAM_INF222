package Locations;

import Me.Tourist;

public class Albay implements Location{
    
    int airFare = 70;

    public int getAirFare() {
        return airFare; 
    }

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}
