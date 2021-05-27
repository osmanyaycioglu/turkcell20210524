package com.training.turkcell.basic.inheritance2.compose;


public class CatBehavior extends AnimalBehaviour {

    @Override
    public void eat() {
        System.out.println("cat eating.");
    }

    @Override
    public void move() {
        System.out.println("Cat 4 moving.");
    }

    @Override
    public void talk() {
        System.out.println("Miyav miyav.");
    }

}
