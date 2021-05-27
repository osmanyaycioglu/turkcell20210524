package com.training.turkcell.structure.tests.bridge;

import com.training.turkcell.basic.inheritance.BMW320;
import com.training.turkcell.basic.inheritance.BMW520;
import com.training.turkcell.basic.inheritance.Car;
import com.training.turkcell.basic.inheritance.MercedesE;
import com.training.turkcell.basic.inheritance.trans.ETransType;
import com.training.turkcell.basic.inheritance.yakit.EYakitTipi;

public class CarFactory {

    // BMW520-elektirik-auto
    public static Car createCar(final String s,
                                final ETransType eTransTypeParam,
                                final EYakitTipi eYakitTipiParama) {
        switch (s) {
            case "BMW520":
                return new BMW520(eTransTypeParam,
                                  eYakitTipiParama);
            case "BMW320":
                return new BMW320(eTransTypeParam,
                                  eYakitTipiParama);
            case "MERCEDESE":
                return new MercedesE(eTransTypeParam,
                                     eYakitTipiParama);

            default:
                return null;
        }
    }
}
