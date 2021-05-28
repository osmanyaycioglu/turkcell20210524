package com.training.turkcell.behavior.state;


public class StateSession implements ICaseState {

    private ICaseState currentSate = new LowerState(this);

    @Override
    public void upper() {
        this.currentSate.upper();
    }

    @Override
    public void lower() {
        this.currentSate.lower();
    }

    public ICaseState getCurrentSate() {
        return this.currentSate;
    }

    void setCurrentSate(final ICaseState currentSateParam) {
        this.currentSate = currentSateParam;
    }

    @Override
    public void print(final String str) {
        this.currentSate.print(str);

    }

}
