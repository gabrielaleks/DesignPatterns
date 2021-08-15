package Ducks;

import FlyBehavior.*;
import QuackBehavior.*;

public abstract class Duck {
    // Variáveis de instância das interfaces
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    // O objeto duck não lida com os comportamentos de quack e fly
    // diretamente, mas sim delega esses comportamentos para os objetos
    // referenciados pelas interfaces

    public abstract void display();

    public void swim() {
        System.out.println("Every duck");
    }
    
    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    // Métodos para definição de comportamento em tempo de execução

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
    
}