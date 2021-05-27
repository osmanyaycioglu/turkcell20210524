package com.training.turkcell.basic.inheritance.yakit;


public class YakitFactory {

    public static Yakit createYakit(final EYakitTipi eYakitTipiParam) {
        switch (eYakitTipiParam) {
            case BENZINLI:
                return new BenzinliYakit();
            case DIZEL:
                return new DizelYakit();
            case ELEKTIRIKLI:
                return new ElektirikliYakit();
            case HIBRIT:
                return new HibritYakit();
            default:
                return new BenzinliYakit();
        }
    }
}
