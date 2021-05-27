package com.training.turkcell.basic.inheritance;


public class Car {

    public static final int MANUAL_TRUNK = 1;
    public static final int AUTO_TRUNK   = 2;

    int                     horsePower;
    int                     topSpeed;
    int                     doorcount;
    int                     trunkType;
    String                  model;


    public Car(final int trunkTypeParam,
               final String modelParam) {
        this.trunkType = trunkTypeParam;
        this.model = modelParam;
    }

    public void openTrunk() {
        switch (this.trunkType) {
            case MANUAL_TRUNK:
                System.out.println("manual");
                break;
            case AUTO_TRUNK:
                System.out.println("automatic");
                break;

            default:
                System.out.println("manual");
                break;
        }
    }

    public void forward() {
        System.out.println("top speed : " + this.topSpeed + " forward");
    }

    public int getHorsePower() {
        return this.horsePower;
    }

    public void setHorsePower(final int horsePowerParam) {
        this.horsePower = horsePowerParam;
    }

    public int getTopSpeed() {
        return this.topSpeed;
    }

    public void setTopSpeed(final int topSpeedParam) {
        this.topSpeed = topSpeedParam;
    }

    public int getDoorcount() {
        return this.doorcount;
    }

    public void setDoorcount(final int doorcountParam) {
        this.doorcount = doorcountParam;
    }


}
