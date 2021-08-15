import Ducks.*;
import FlyBehavior.FlyRocketPowered;
import FlyBehavior.FlyWithWings;
import QuackBehavior.Quack;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        mallard.display();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered()); // Definição em tempo de execução 
        model.performFly();

        Duck modelctor = new ModelConstructor(new FlyWithWings(), new Quack());
        modelctor.performFly();
        modelctor.performQuack();
        
    }
}
