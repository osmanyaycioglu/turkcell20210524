package com.training.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CLIRun1 implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(CLIRun1.class);

    @Autowired
    @Qualifier("executeCN")
    private IExecute            executor;

    @Override
    public void run(final String... argsParam) throws Exception {
        if (CLIRun1.logger.isInfoEnabled()) {
            CLIRun1.logger.info("[CLIRun1][run]-> " + this.executor.execute());
        }

    }

}
