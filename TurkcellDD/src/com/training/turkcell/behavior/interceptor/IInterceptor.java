package com.training.turkcell.behavior.interceptor;

public interface IInterceptor {

    void intercept(String str);

    String getCommandStr();
}
