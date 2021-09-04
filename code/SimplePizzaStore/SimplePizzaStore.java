import Factory.SimplePizzaFactory;
import Store.PizzaStore;

public class SimplePizzaStore {
    public static void main(String[] args) {
        SimplePizzaFactory pizzaFactory = new SimplePizzaFactory();

        PizzaStore pizzaStore = new PizzaStore(pizzaFactory);
        pizzaStore.orderPizza("pepperoni");
        
        PizzaStore pizzaStore2 = new PizzaStore(pizzaFactory);
        pizzaStore2.orderPizza("cheese");

    }
}
