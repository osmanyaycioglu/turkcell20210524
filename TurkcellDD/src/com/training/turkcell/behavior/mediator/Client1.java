package com.training.turkcell.behavior.mediator;


public class Client1 extends AbstractClient {


    public Client1(final Mediator mediatorParam) {
        super(mediatorParam);
    }

    @Override
    public void messageReceived(final String msgParam) {
        System.out.println("client1 received : " + msgParam);
    }

    @Override
    public String getName() {
        return this.getClass()
                   .getSimpleName();
    }

    @Override
    public void sendMessage(final String msgParam) {
        this.mediator.sendMessage(this,
                                  msgParam);
    }

}
