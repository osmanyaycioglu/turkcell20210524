package com.training.turkcell.behavior.strategy;


public class HalfDucking extends Duck {

    int count;

    @Override
    public void duck() {
        this.count++;
        if ((this.count % 2) == 0) {
            System.out.println("Vuruldum");
        } else {
            System.out.println("Vurulmadım");
        }
    }
}
