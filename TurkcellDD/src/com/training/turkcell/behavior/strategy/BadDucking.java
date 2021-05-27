package com.training.turkcell.behavior.strategy;


public class BadDucking extends Duck {

    int count;

    @Override
    public void duck() {
        this.count++;
        if ((this.count % 10) == 0) {
            System.out.println("Vurulmadım");
        } else {
            System.out.println("Vuruldum");
        }
    }
}
