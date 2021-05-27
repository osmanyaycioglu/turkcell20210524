package com.training.turkcell.basic.inheritance.yakit;

public abstract class Yakit {

    private final EYakitTipi yt;
    private final int        elektirikHarcama;


    public Yakit(final EYakitTipi ytParam,
                 final int elektirikHarcamaParam) {
        super();
        this.yt = ytParam;
        this.elektirikHarcama = elektirikHarcamaParam;
    }


    public int devirDegistir(final int devir) {
        return this.elektirikHarcama * devir * this.yt.getHarcama();
    }


    public EYakitTipi getYt() {
        return this.yt;
    }


    public int getElektirikHarcama() {
        return this.elektirikHarcama;
    }


}
