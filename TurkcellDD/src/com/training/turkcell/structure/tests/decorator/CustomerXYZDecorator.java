package com.training.turkcell.structure.tests.decorator;

import com.training.turkcell.structure.tests.Customer;

public class CustomerXYZDecorator extends CustomerDecorator {


    public CustomerXYZDecorator(final Customer customerParam) {
        super();
        this.customer = customerParam;
    }


    @Override
    public String getName() {
        return "XYZ " + this.customer.getName();
    }

}
