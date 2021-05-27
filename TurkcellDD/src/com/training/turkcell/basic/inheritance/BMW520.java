package com.training.turkcell.basic.inheritance;

import com.training.turkcell.basic.inheritance.trans.ETransType;
import com.training.turkcell.basic.inheritance.yakit.EYakitTipi;

public class BMW520 extends BMW {


    public BMW520(final ETransType eTransTipiParam,
                  final EYakitTipi eYakitTipiParam) {
        super("520",
              eTransTipiParam,
              eYakitTipiParam);
    }

}