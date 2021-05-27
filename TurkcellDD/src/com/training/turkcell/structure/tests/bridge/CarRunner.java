package com.training.turkcell.structure.tests.bridge;

import com.training.turkcell.basic.inheritance.BMW320;
import com.training.turkcell.basic.inheritance.Car;
import com.training.turkcell.basic.inheritance.trans.ETransType;
import com.training.turkcell.basic.inheritance.yakit.EYakitTipi;

public class CarRunner {

    public static void main(final String[] args) {
        Car carLoc = CarFactory.createCar(args[0],
                                          ETransType.AUTOMATIC,
                                          EYakitTipi.ELEKTIRIKLI);
        carLoc.forward();
        carLoc.openTrunk();

        Car car2Loc = new BMW320(ETransType.AUTOMATIC,
                                 EYakitTipi.DIZEL);
        car2Loc.forward();
        car2Loc.openTrunk();

    }


}
