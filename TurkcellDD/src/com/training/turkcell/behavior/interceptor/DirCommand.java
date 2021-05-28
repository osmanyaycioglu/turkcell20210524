package com.training.turkcell.behavior.interceptor;


public class DirCommand implements IInterceptor {

    @Override
    public void intercept(final String strParam) {
        System.out.println("DirCommand Parametre : " + strParam);

    }

    @Override
    public String getCommandStr() {
        return "dir";
    }

}
