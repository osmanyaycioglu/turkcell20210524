package com.training.turkcell.structure.tests.facade;


public class CustomerProvisionFactory {

    public static ICustomerProvision createCustomerProvision() {
        return new CustomerProvisionFacade();
    }
}
