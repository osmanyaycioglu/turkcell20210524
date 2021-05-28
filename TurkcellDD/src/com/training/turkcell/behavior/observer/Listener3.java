package com.training.turkcell.behavior.observer;


public class Listener3 implements IListener {

    @Override
    public void phase1(final String msgParam) {
        System.out.println("Listener3 Phase1 : " + msgParam);
    }

    @Override
    public void phase2(final String msgParam) {
        System.out.println("Listener3 Phase2 : " + msgParam);

    }

    @Override
    public void phase3(final String msgParam) {
        System.out.println("Listener3 Phase3 : " + msgParam);

    }

}
