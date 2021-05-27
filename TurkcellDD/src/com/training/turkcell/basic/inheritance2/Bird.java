package com.training.turkcell.basic.inheritance2;


public class Bird extends Animal {

    @Override
    public void eat() {
        System.out.println("Bird eating.");
    }

    @Override
    public void move() {
        System.out.println("Bird flying.");
    }

    @Override
    public void talk() {
        System.out.println("Cik cik.");
    }

}
