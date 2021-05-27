package com.training.turkcell.basic.inheritance.yakit;


public enum EYakitTipi {

    BENZINLI(100),
    DIZEL(150),
    HIBRIT(75),
    ELEKTIRIKLI(50);

    private final int harcama;

    private EYakitTipi(final int harcamaParam) {
        this.harcama = harcamaParam;
    }

    public int getHarcama() {
        return this.harcama;
    }
}
