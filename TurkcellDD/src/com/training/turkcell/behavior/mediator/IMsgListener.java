package com.training.turkcell.behavior.mediator;


public interface IMsgListener {

    void messageReceived(String msg);

    String getName();

    void sendMessage(String msg);

}
