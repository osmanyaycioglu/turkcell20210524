package com.training.spring;

import org.springframework.stereotype.Component;

@Component
public class ExecuteTR implements IExecute {

    public ExecuteTR() {
    }

    @Override
    public String execute() {
        return "selam";
    }


}
