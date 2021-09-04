package Condiments;

import Beverages.Beverage;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public String getSize() {
        return beverage.getSize();
    }

    public double cost() {
        double cost = beverage.cost();
        
        switch (beverage.getSize()) {
            case "Tall":
                cost += .10;
                break;
            case "Grande":
                cost += .15;
                break;
            case "Venti":
                cost += .20;
                break;
            default:
                break;
            }
    
        return cost;
    }

}
