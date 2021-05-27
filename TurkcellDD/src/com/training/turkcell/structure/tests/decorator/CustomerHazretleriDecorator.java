package com.training.turkcell.structure.tests.decorator;

import com.training.turkcell.structure.tests.Customer;

public class CustomerHazretleriDecorator extends CustomerDecorator {


    public CustomerHazretleriDecorator(final Customer customerParam) {
        super();
        this.customer = customerParam;
    }


    @Override
    public String getSurname() {
        return this.customer.getSurname() + " hazretleri.";
    }
}
