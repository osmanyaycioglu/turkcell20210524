package com.training.turkcell.dp.creation.singleton;


public class SingletonRun {

    public static void main(final String[] args) {
        EagerSingleton.getInstance()
                      .hello();
        LazySingleton.getInstance()
                     .hello();
        FinalSingleton.INSTANCE1.hello();
        FinalSingleton.INSTANCE2.hello();
    }
}
