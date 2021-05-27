package com.training.turkcell.structure.tests.decorator;

import com.training.turkcell.structure.tests.Customer;

public class CustomerSayinDecorator extends CustomerDecorator {


    public CustomerSayinDecorator(final Customer customerParam) {
        super();
        this.customer = customerParam;
    }

    @Override
    public String getName() {

        return "Sayın " + this.customer.getName();
    }

}
