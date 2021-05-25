package com.training.turkcell.dp.creation.singleton;


public class EagerSingleton {

    private static EagerSingleton instance = new EagerSingleton();


    private EagerSingleton() {
        // Cache
    }

    public static EagerSingleton getInstance() {
        return EagerSingleton.instance;
    }

    public void hello() {
        System.out.println("Hello from eager singleton");
    }
}
