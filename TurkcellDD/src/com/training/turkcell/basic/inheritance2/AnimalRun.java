package com.training.turkcell.basic.inheritance2;


public class AnimalRun {

    public static void main(final String[] args) {
        Animal bird = new Animal();
        bird.eat();
        bird.move();
        bird.talk();
        System.out.println("-------------------------------------");
        Animal cat = new Animal();
        cat.eat();
        cat.move();
        cat.talk();
        System.out.println("-------------------------------------");
        AnimalData birdAnimalDataLoc = new AnimalData(1);
        birdAnimalDataLoc.eat();
        birdAnimalDataLoc.move();
        birdAnimalDataLoc.talk();
        System.out.println("-------------------------------------");
        AnimalData catAnimalDataLoc = new AnimalData(2);
        catAnimalDataLoc.eat();
        catAnimalDataLoc.move();
        catAnimalDataLoc.talk();
        System.out.println("-------------------------------------");
        Animal birdAnimalLoc = AnimalFactory.createAnimal(3);
        birdAnimalLoc.eat();
        birdAnimalLoc.move();
        birdAnimalLoc.talk();

    }
}
