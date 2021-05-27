package com.training.turkcell.basic.inheritance2;


public class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("dog eating.");
    }

    @Override
    public void move() {
        System.out.println("Dog 4 moving.");
    }

    @Override
    public void talk() {
        System.out.println("Hav hav.");
    }

}
