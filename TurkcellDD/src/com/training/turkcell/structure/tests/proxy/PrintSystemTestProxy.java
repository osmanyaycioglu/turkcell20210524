package com.training.turkcell.structure.tests.proxy;

import com.training.turkcell.structure.tests.Customer;
import com.training.turkcell.structure.tests.PrintSystem;

public class PrintSystemTestProxy extends PrintSystem {

    @Override
    public void print(final Customer custParam) {
        // start trans
        System.out.println("Print işlemi başlıyor");
        super.print(custParam);
        System.out.println("Print işlemi bitti");
        // commit
    }

}
