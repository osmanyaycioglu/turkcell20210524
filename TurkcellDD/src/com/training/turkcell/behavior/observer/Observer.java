package com.training.turkcell.behavior.observer;

import java.util.ArrayList;
import java.util.List;

public class Observer implements IListener {

    private final List<IListener> listeners = new ArrayList<>();

    public void addListener(final IListener listenerParam) {
        this.listeners.add(listenerParam);
    }

    @Override
    public void phase1(final String msg) {
        for (IListener iListenerLoc : this.listeners) {
            iListenerLoc.phase1(msg);
        }
    }

    @Override
    public void phase2(final String msg) {
        for (IListener iListenerLoc : this.listeners) {
            iListenerLoc.phase2(msg);
        }

    }

    @Override
    public void phase3(final String msg) {
        for (IListener iListenerLoc : this.listeners) {
            iListenerLoc.phase3(msg);
        }
    }


}
