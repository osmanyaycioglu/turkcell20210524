package com.training.turkcell.behavior.strategy;


public class Soldier {

    private final Aim aim;
    private Duck      duck = new HalfDucking();

    public Soldier(final Aim aimParam,
                   final Duck duckParam) {
        super();
        this.aim = aimParam;
        this.duck = duckParam;
    }

    public Soldier(final Aim aimParam) {
        super();
        this.aim = aimParam;
    }

    public void shoot() {
        // Code
        this.aim.vurma();
    }

    public void duck() {
        this.duck.duck();
    }

    public void duckAndShoot() {
        this.duck();
        this.shoot();
    }

}
