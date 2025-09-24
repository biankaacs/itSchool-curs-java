package org.example.session34;

interface Animal {
    void makeSound();
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("bark bark");
    }
}

class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("meow meow");
    }
}

class Tiger implements Animal {
    @Override
    public void makeSound() {
        System.out.println("roar roar");
    }
}

class AnimalFactory {
    public static Animal createAnimal(String type) {

        if (type.equalsIgnoreCase("dog")) return new Dog();
        else if (type.equalsIgnoreCase("cat")) return new Cat();
        else if (type.equalsIgnoreCase("tiger")) return new Tiger();

        return null;
        }
    }


public class Factory {
    public static void main(String[] args) {
        AnimalFactory factory = new AnimalFactory();
        Animal dog = factory.createAnimal("dog");
        dog.makeSound();
        Animal cat = factory.createAnimal("cat");
        cat.makeSound();
        Animal tiger = factory.createAnimal("tiger");
        tiger.makeSound();
    }
}
