package com.training.turkcell.behavior.state;


public class LowerState implements ICaseState {

    private final StateSession ss;

    public LowerState(final StateSession ssParam) {
        super();
        this.ss = ssParam;
    }

    @Override
    public void upper() {
        this.ss.setCurrentSate(new UpperState(this.ss));
    }

    @Override
    public void lower() {
    }

    @Override
    public void print(final String str) {
        System.out.println(str.toLowerCase());

    }

}
