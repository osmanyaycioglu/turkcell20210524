package com.training.spring;

import org.springframework.stereotype.Component;

@Component
public class ExecuteJP implements IExecute {

    public ExecuteJP() {
    }

    @Override
    public String execute() {
        return "ha";
    }


}
