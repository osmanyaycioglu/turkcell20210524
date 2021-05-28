package com.training.turkcell.behavior.observer;


public class Listener1 implements IListener {

    @Override
    public void phase1(final String msgParam) {
        System.out.println("Listener1 Phase1 : " + msgParam);
    }

    @Override
    public void phase2(final String msgParam) {
        System.out.println("Listener1 Phase2 : " + msgParam);

    }

    @Override
    public void phase3(final String msgParam) {
        System.out.println("Listener1 Phase3 : " + msgParam);

    }

}
