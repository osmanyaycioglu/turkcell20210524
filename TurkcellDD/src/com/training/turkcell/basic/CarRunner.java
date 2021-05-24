package com.training.turkcell.basic;

import java.util.List;

public class CarRunner {

    public static void main(final String[] args) {
        FourDoorCar car4Loc = new FourDoorCar();
        car4Loc.setMaxSpeed(200);

        Car2 acrCar2Loc = new Car2(4);
        Integer doorCountLoc = acrCar2Loc.getDoorCount();
        acrCar2Loc.getSubCar()
                  .setXyz(10);
        List<String> strsLoc = acrCar2Loc.getStrs();
        strsLoc.clear();
    }
}
