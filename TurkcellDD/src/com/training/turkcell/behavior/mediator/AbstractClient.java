package com.training.turkcell.behavior.mediator;


public abstract class AbstractClient implements IMsgListener {

    protected Mediator mediator;

    public AbstractClient(final Mediator mediatorParam) {
        super();
        this.mediator = mediatorParam;
        this.mediator.register(this);
    }


}
