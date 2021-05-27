package com.training.turkcell.structure.tests;

public class PrintSystem implements IPrintSystem {

    @Override
    public void print(final Customer cust) {
        System.out.println(cust.getName() + " " + cust.getSurname());
    }

}
