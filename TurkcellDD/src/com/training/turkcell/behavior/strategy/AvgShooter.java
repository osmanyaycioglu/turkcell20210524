package com.training.turkcell.behavior.strategy;


public class AvgShooter extends Aim {

    private int count;

    @Override
    public void vurma() {
        this.count++;
        if ((this.count % 2) == 0) {
            System.out.println("Vurdum");
        } else {
            System.out.println("Vuramadım");
        }
    }

}
