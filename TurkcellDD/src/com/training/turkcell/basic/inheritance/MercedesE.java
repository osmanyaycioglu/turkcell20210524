package com.training.turkcell.basic.inheritance;

public class MercedesE extends Mercedes {

    @Override
    public void forward() {
        if (true) {
            System.out.println("as");
        }
        System.out.println("asm");
        System.out.println("top speed BMW520 : " + this.topSpeed + " forward");
    }
}
