package com.training.turkcell.basic.inheritance;

import com.training.turkcell.basic.inheritance.trans.ETransType;
import com.training.turkcell.basic.inheritance.trans.Trans;
import com.training.turkcell.basic.inheritance.yakit.EYakitTipi;
import com.training.turkcell.basic.inheritance.yakit.YakitFactory;

public class BMW extends Car {


    public BMW(final String model,
               final ETransType eTransTipiParam,
               final EYakitTipi eYakitTipiParam) {
        super(Car.MANUAL_TRUNK,
              "BMW",
              model,
              new Trans(YakitFactory.createYakit(eYakitTipiParam),
                        eTransTipiParam));
    }

}
