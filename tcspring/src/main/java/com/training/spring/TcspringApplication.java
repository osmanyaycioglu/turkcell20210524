package com.training.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TcspringApplication implements ApplicationRunner {

    @Autowired
    private FactoryRunner factoryRunner;

    public static void main(final String[] args) {
        SpringApplication.run(TcspringApplication.class,
                              args);
    }

    @Override
    public void run(final ApplicationArguments argsParam) throws Exception {
        this.factoryRunner.run();
    }

}
