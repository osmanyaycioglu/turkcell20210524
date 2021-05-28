package com.training.turkcell.behavior.observer;


public class Executor {

    private final IListener listener;

    public Executor(final IListener listenerParam) {
        super();
        this.listener = listenerParam;
    }

    public void run() {
        try {
            Thread.sleep(1000);
        } catch (Exception eLoc) {
        }
        this.listener.phase1("faz 1 bitti");
        try {
            Thread.sleep(1000);
        } catch (Exception eLoc) {
        }
        this.listener.phase2("faz 2 bitti");
        try {
            Thread.sleep(1000);
        } catch (Exception eLoc) {
        }
        this.listener.phase3("faz 3 bitti");
    }

}
