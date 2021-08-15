package Ducks;

import FlyBehavior.*;
import QuackBehavior.*;

public class ModelConstructor extends Duck {
    public ModelConstructor(
        FlyBehavior fp,
        QuackBehavior qb
    ) {
        flyBehavior = fp;
        quackBehavior = qb;
    }

    public void display() {
        System.out.println("I'm a model duck defined by my constructor!");
    }
}
