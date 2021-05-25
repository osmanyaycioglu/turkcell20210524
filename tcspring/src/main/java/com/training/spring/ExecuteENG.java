package com.training.spring;

import org.springframework.stereotype.Component;

@Component
public class ExecuteENG implements IExecute {

    public ExecuteENG() {
    }

    @Override
    public String execute() {
        return "hello";
    }


}
