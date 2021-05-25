package com.training.turkcell.java8.lambda;


public class MyProcImpl implements IProc {

    private final int port;


    public MyProcImpl(final int portParam) {
        super();
        this.port = portParam;
    }


    @Override
    public void proc(final String strParam) {
        System.out.println(this.port + " output : " + strParam);
    }

}
