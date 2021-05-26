package com.training.turkcell.structure.tests.proxy;

import com.training.turkcell.structure.tests.Customer;
import com.training.turkcell.structure.tests.PrintSystem;

public class PrintSystemDelegation extends PrintSystem {

    private final PrintSystem ps;

    public PrintSystemDelegation(final PrintSystem psParam) {
        super();
        this.ps = psParam;
    }

    @Override
    public void print(final Customer custParam) {
        System.out.println("Print işlemi başlıyor");
        this.ps.print(custParam);
        System.out.println("Print işlemi bitti");
    }

}
