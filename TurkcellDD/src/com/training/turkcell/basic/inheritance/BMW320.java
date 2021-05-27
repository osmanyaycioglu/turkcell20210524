package com.training.turkcell.basic.inheritance;

import com.training.turkcell.basic.inheritance.trans.ETransType;
import com.training.turkcell.basic.inheritance.yakit.EYakitTipi;

public class BMW320 extends BMW {


    public BMW320(final ETransType eTransTipiParam,
                  final EYakitTipi eYakitTipiParam) {
        super("320",
              eTransTipiParam,
              eYakitTipiParam);
    }


}
