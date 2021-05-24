package com.training.turkcell.basic;


public abstract class Car {

    private int       maxSpeed;
    private final int doorCount;

    public Car(final int doorCount) {
        this.doorCount = doorCount;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public void setMaxSpeed(final int maxSpeedParam) {
        this.maxSpeed = maxSpeedParam;
    }

    public int getDoorCount() {
        return this.doorCount;
    }

}
