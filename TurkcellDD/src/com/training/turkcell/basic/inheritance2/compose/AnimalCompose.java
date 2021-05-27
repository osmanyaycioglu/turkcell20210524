package com.training.turkcell.basic.inheritance2.compose;


public class AnimalCompose {

    private final AnimalBehaviour behave;


    public AnimalCompose(final AnimalBehaviour behaveParam) {
        super();
        this.behave = behaveParam;
    }

    public void eat() {
        this.behave.eat();
    }

    public void move() {
        this.behave.move();
    }

    public void talk() {
        this.behave.talk();
    }

}
