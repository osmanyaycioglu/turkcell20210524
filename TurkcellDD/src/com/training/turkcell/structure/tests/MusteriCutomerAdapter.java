package com.training.turkcell.structure.tests;


public class MusteriCutomerAdapter extends Customer {

    private final Musteri musteri;


    public MusteriCutomerAdapter(final Musteri musteriParam) {
        super();
        this.musteri = musteriParam;
    }

    @Override
    public String getName() {
        return this.musteri.getIsim();
    }

    @Override
    public String getSurname() {
        return this.musteri.getSoyisim();
    }


}
