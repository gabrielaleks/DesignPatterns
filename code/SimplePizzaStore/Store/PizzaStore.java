package Store;

import Factory.SimplePizzaFactory;
import Pizza.Pizza;

public class PizzaStore {
    SimplePizzaFactory factory;
    
    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }
    
    public Pizza orderPizza(String type) {
        Pizza pizza;

        // Uma factory é usada para criar a pizza com base no sabor
        pizza = factory.createPizza(type);
        
        // Comportamentos comuns a todas as pizzas. Existe uma forma padrão de lidar com eles, porém cada
        // sabor pode sobrescrever caso seja necessário.
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        System.out.println(pizza.getType());

        return pizza;
    }
}
