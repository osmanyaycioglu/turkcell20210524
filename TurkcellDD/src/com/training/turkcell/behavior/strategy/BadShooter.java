package com.training.turkcell.behavior.strategy;


public class BadShooter extends Aim {

    private int count;

    @Override
    public void vurma() {
        this.count++;
        if ((this.count % 10) == 0) {
            System.out.println("Vurdum");
        } else {
            System.out.println("Vuramadım");
        }
    }

}
