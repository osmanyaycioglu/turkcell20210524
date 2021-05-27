package com.training.turkcell.behavior.strategy;


public class GameRun {

    public static void main(final String[] args) {

        Soldier soldierLoc = new Soldier(new SharpShooter(),
                                         new BadDucking());
        for (int iLoc = 0; iLoc < 10; iLoc++) {
            System.out.println("*---------------------*");
            soldierLoc.shoot();
            soldierLoc.duck();
            soldierLoc.duckAndShoot();

        }
    }
}
