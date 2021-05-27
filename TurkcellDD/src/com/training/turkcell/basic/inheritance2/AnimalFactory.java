package com.training.turkcell.basic.inheritance2;


public class AnimalFactory {

    public static Animal createAnimal(final int type) {
        switch (type) {
            case 1:
                return new Bird();
            case 2:
                return new Cat();
            case 3:
                return new Dog();

            default:
                return new Animal();
        }
    }
}
