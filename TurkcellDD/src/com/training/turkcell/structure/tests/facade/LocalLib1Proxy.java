package com.training.turkcell.structure.tests.facade;

import com.training.turkcell.structure.tests.Lib1;

public class LocalLib1Proxy {

    private final Lib1 lib1;


    public LocalLib1Proxy(final Lib1 lib1Param) {
        super();
        this.lib1 = lib1Param;
    }


    public void doSomething() {
        this.lib1.doSomething();
    }


}
