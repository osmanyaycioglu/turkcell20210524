package com.training.turkcell.behavior.interceptor;


public class RunCommand implements IInterceptor {

    @Override
    public void intercept(final String strParam) {
        String[] splitLoc = strParam.split(" ");
        System.out.println("RunCommand Parametre : " + strParam);

    }

    @Override
    public String getCommandStr() {
        return "run";
    }

}
