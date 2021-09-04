package Condiments;

import Beverages.Beverage;


// Extende Beverage pq deve poder ser utilizada no lugar dessa
public abstract class CondimentDecorator extends Beverage {
    // Colocamos getDescription() como abstract pq queremos que todo
    // CondimentDecorator implement esse método
    public abstract String getDescription();

    public abstract String getSize();
}
