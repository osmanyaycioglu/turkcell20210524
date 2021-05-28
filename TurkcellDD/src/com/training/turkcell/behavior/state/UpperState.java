package com.training.turkcell.behavior.state;


public class UpperState implements ICaseState {

    private final StateSession ss;

    public UpperState(final StateSession ssParam) {
        super();
        this.ss = ssParam;
    }

    @Override
    public void upper() {

    }

    @Override
    public void lower() {
        this.ss.setCurrentSate(new LowerState(this.ss));
    }

    @Override
    public void print(final String strParam) {
        System.out.println(strParam.toUpperCase());

    }

}
