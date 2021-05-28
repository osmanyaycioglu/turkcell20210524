package com.training.turkcell.behavior.chainofresp;


public class CheckNotProc implements ICheckNumber {


    public CheckNotProc() {
        super();
    }

    @Override
    public void check(final int numberParam) {
        System.out.println("rakam kurallara uymadı");
    }


}
