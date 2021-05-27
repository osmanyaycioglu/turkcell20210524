package com.training.turkcell.basic.inheritance;

import com.training.turkcell.basic.inheritance.trans.ETransType;
import com.training.turkcell.basic.inheritance.yakit.EYakitTipi;

public class MercedesE extends Mercedes {

    public MercedesE(final ETransType eTransTipiParam,
                     final EYakitTipi eYakitTipiParam) {
        super("E",
              eTransTipiParam,
              eYakitTipiParam);
    }


}
