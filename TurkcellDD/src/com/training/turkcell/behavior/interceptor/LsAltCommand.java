package com.training.turkcell.behavior.interceptor;


public class LsAltCommand implements IInterceptor {

    @Override
    public void intercept(final String strParam) {
        String[] splitLoc = strParam.split(" ");
        System.out.println("LsCommand Parametre : " + strParam);

    }

    @Override
    public String getCommandStr() {
        return "ls";
    }

}
