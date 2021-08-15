interface Animal {
    public void makeSound();
}

class Dog implements Animal {
    public void makeSound() {
        bark();
    }
    
    public void bark() {
        System.out.println("bark");
    }
}

class Cat implements Animal {
    public void makeSound() {
        meow();
    }
    
    public void meow() {
        System.out.println("meow");
    }
}

class Teste {
    public static void main(String args[]) {
        // Programando pra implementação
        Dog d = new Dog();
        d.bark();
        
        Cat c = new Cat();
        c.meow();
        
        // Programando pra interface
        Animal animal = new Dog();
        animal.makeSound();

    }
}