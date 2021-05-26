package com.training.turkcell.structure.tests.adapter;

import com.training.turkcell.structure.tests.Customer;
import com.training.turkcell.structure.tests.Musteri;

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

    @Override
    public String getGender() {
        return this.musteri.getCinsiyet();
    }

}
