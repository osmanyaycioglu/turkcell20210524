package com.training.turkcell.behavior.observer;


public class ObserverFactory {

    public static IListener createObserver() {
        Observer observerLoc = new Observer();
        observerLoc.addListener(new Listener1());
        observerLoc.addListener(new Listener2());
        observerLoc.addListener(new Listener3());
        observerLoc.addListener(new Listener4());
        observerLoc.addListener(new Listener5());
        observerLoc.addListener(new Listener6());
        return observerLoc;
    }
}
