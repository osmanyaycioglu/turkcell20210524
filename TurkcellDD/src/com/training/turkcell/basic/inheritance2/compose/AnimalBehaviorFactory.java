package com.training.turkcell.basic.inheritance2.compose;


public class AnimalBehaviorFactory {

    public static AnimalBehaviour createBehavior(final int type) {
        switch (type) {
            case 1:
                return new BirdBehavior();
            case 2:
                return new CatBehavior();

            default:
                return new AnimalBehaviour();
        }
    }
}
