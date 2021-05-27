package com.training.turkcell.basic.inheritance;

import com.training.turkcell.basic.inheritance.trans.Trans;

public class Car {

    public static final int MANUAL_TRUNK = 1;
    public static final int AUTO_TRUNK   = 2;

    int                     horsePower;
    int                     topSpeed;
    int                     doorcount;
    int                     trunkType;
    String                  model;
    Trans                   trans;
    private String          brand;


    public Car(final int trunkTypeParam,
               final String brandParam,
               final String modelParam,
               final Trans transParam) {
        this.trunkType = trunkTypeParam;
        this.brand = brandParam;
        this.model = modelParam;
        this.trans = transParam;
    }

    public void forward() {
        int harcananElektirikLoc = this.trans.changeGear();
        System.out.println(this.brand
                           + " "
                           + this.model
                           + " "
                           + this.trans.getType()
                           + " "
                           + this.trans.getYakit()
                                       .getYt()
                           + " Harcanan elektirik : "
                           + harcananElektirikLoc);
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

    public Trans getTrans() {
        return this.trans;
    }

    public void setTrans(final Trans transParam) {
        this.trans = transParam;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(final String brandParam) {
        this.brand = brandParam;
    }


}
