package com.training.spring;

import org.springframework.stereotype.Component;

@Component
public class ExecuteESP implements IExecute {

    public ExecuteESP() {
    }

    @Override
    public String execute() {
        return "ola";
    }


}
