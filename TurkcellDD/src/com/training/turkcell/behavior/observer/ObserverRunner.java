package com.training.turkcell.behavior.observer;


public class ObserverRunner {

    public static void main(final String[] args) {
        Executor executorLoc = new Executor(ObserverFactory.createObserver());
        executorLoc.run();
    }
}
