package com.training.turkcell.basic.inheritance2.compose;


public class MamalAnimalCompose extends AnimalCompose {

    public MamalAnimalCompose(final AnimalBehaviour behaveParam) {
        super(behaveParam);
    }

    @Override
    public void move() {
        System.out.println("Yürüyor");
    }

}
