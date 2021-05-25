package com.training.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CLIRun2 implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(CLIRun2.class);

    @Autowired
    @Qualifier("executeTR")
    private IExecute            executor;

    @Override
    public void run(final String... argsParam) throws Exception {
        if (CLIRun2.logger.isInfoEnabled()) {
            CLIRun2.logger.info("[CLIRun2][run]-> " + this.executor.execute());
        }

    }

}
