package com.training.turkcell.structure.tests.decorator;

import com.training.turkcell.structure.tests.Customer;

public class CustomerGenderDecorator extends CustomerDecorator {

    public CustomerGenderDecorator(final Customer customerParam) {
        super();
        this.customer = customerParam;
    }


    @Override
    public String getName() {
        switch (this.customer.getGender()) {
            case "erkek":
                return "Bay " + this.customer.getName();
            case "kadin":
                return "Bayan " + this.customer.getName();
            default:
                return this.customer.getName();
        }
    }

}
