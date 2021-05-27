package com.training.turkcell.basic.inheritance2.compose;


public class BirdBehavior extends AnimalBehaviour {

    @Override
    public void eat() {
        System.out.println("bird eating.");
    }

    @Override
    public void move() {
        System.out.println("bird flying.");
    }

    @Override
    public void talk() {
        System.out.println("Cik cik.");
    }

}
