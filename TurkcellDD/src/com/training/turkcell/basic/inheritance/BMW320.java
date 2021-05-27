package com.training.turkcell.basic.inheritance;


public class BMW320 extends BMW {

    public BMW320() {
        super("320");
        System.out.println("test");
    }

    @Override
    public void forward() {
        System.out.println("top speed BMW520 : " + this.topSpeed + " forward");
    }
}
