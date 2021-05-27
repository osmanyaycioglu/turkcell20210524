package com.training.turkcell.basic.inheritance2.compose;


public class AnimalComposeRun {

    public static void main(final String[] args) {
        AnimalCompose animalComposeLoc = new AnimalCompose(AnimalBehaviorFactory.createBehavior(1));
        animalComposeLoc.eat();
        animalComposeLoc.move();
        animalComposeLoc.talk();
    }
}
