import Beverages.Beverage;
import Beverages.Espresso;
import Beverages.HouseBlend;
import Condiments.Mocha;
import Condiments.Soy;

public class StarbuzzCoffe {
    public static void main(String[] args) {
        Beverage beverage = new HouseBlend();
        System.out.println(beverage.getDescription() + ": $" + beverage.cost()); // House Blend Coffe: $0.89
        
        Beverage beverage2 = new Espresso();
        System.out.println(beverage2.getDescription() + ": $" + beverage2.cost()); // Espresso: $1.99
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription() + ": $" + beverage2.cost()); // Espresso, Mocha: $2.19
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription() + ": $" + beverage2.cost()); // Espresso, Mocha: $2.39
        
        Beverage beverage3 = new HouseBlend();
        System.out.println(beverage3.getDescription() + ": $" + beverage3.cost()); // House Blend Coffe: $0.89
        beverage3.setSize("Venti");
        beverage3 = new Soy(beverage3);
        System.out.println(beverage3.getDescription() + ": $" + beverage3.cost()); // House Blend Coffe, Soy: $1.09
    }
}
