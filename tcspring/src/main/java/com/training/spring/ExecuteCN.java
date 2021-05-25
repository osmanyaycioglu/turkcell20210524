package com.training.spring;

import org.springframework.stereotype.Component;

@Component
public class ExecuteCN implements IExecute {

    public ExecuteCN() {
    }

    @Override
    public String execute() {
        return "na ha";
    }


}
