package Me;

import Locations.*;

public class Myself implements Tourist {
    
    private int budget = 1000;
    
    public void visit() {
        if (this.budget - 0 < 0) {
            System.out.println("Not enough money to travel.");
        } else {
            System.out.println("Enjoying my stay.");
            budget -= 0;
        }
        checkBudget();
    }

    @Override
    public void visit(Boracay boracay) {
        if (this.budget - boracay.getAirFare() < 0) {
            System.out.println("Not enough money to travel Boracay.");
        } else {
            System.out.println("Enjoying Boracay.");
            budget -= boracay.getAirFare();
        }
        checkBudget();
    }

    @Override
    public void visit(Batangas batangas) {
        if (this.budget - batangas.getAirFare() < 0) {
            System.out.println("Not enough money to travel Batangas.");
        } else {
            System.out.println("Enjoying Batangas.");
            budget -= batangas.getAirFare();
        }
        checkBudget();
    }

    @Override
    public void visit(Elyu elyu) {
        if (this.budget - elyu.getAirFare() < 0) {
            System.out.println("Not enough money to travel Elyu.");
        } else {
            System.out.println("Enjoying Elyu.");
            budget -= elyu.getAirFare();
        }
        checkBudget();
    }

    @Override
    public void visit(Albay albay) {
        if (this.budget - albay.getAirFare() < 0) {
            System.out.println("Not enough money to travel Albay.");
        } else {
            System.out.println("Enjoying Albay.");
            budget -= albay.getAirFare();
        }
        checkBudget();
    }

    @Override
    public void visit(Palawan palawan) {
        if (this.budget - palawan.getAirFare() < 0) {
            System.out.println("Not enough money to travel Palawan.");
        } else {
            System.out.println("Enjoying Palawan.");
            budget -= palawan.getAirFare();
        }
        checkBudget();
    }
    
    
    public void checkBudget() {
        System.out.println("My budget is " + this.budget);
        System.out.println();
    }

}
