package com.training.turkcell.basic.inheritance;


public class BMW520 extends BMW {

    public BMW520() {
        super();
        System.out.println("test");
    }

    @Override
    public void forward() {
        System.out.println("top speed BMW520 : " + this.topSpeed + " forward");
    }
}
