package Condiments;

import Beverages.Beverage;

// Todos os decorators extendem da classe abstrata do decorator, que por sua vez
// extende Beverage (outra classe abstrata)
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
    
    public String getSize() {
        return beverage.getSize();
    }

    public double cost() {
        return .20 + beverage.cost();
    }
}
