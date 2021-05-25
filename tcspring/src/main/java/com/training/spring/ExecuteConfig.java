package com.training.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExecuteConfig {


    @Value("${tr.type}")
    private int executeType;

    @Bean
    @Qualifier("general")
    public IExecute createExecute() {
        IExecute executeLoc = null;
        switch (this.executeType) {
            case 1:
                executeLoc = new ExecuteENG();
                break;
            case 2:
                executeLoc = new ExecuteTR();
                break;
            case 3:
                executeLoc = new ExecuteESP();
                break;
            case 4:
                executeLoc = new ExecuteESP();
                break;
            case 5:
                executeLoc = new ExecuteCN();
                break;
            default:
                executeLoc = new ExecuteENG();
                break;
        }
        return executeLoc;
    }

}
