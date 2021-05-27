package com.training.turkcell.structure.tests.decorator;

import com.training.turkcell.structure.tests.Customer;

public class CustomerDecorator extends Customer {

    Customer customer;


    public Customer getCustomer() {
        return this.customer;
    }


    public void setCustomer(final Customer customerParam) {
        this.customer = customerParam;
    }


    @Override
    public String getGender() {
        return this.customer.getGender();
    }

    @Override
    public String getName() {
        return this.customer.getName();
    }

    @Override
    public String getSurname() {
        return this.customer.getSurname();
    }


}
