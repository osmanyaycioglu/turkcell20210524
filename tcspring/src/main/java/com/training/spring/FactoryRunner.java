package com.training.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FactoryRunner {

    private static final Logger logger = LoggerFactory.getLogger(FactoryRunner.class);

    @Autowired
    @Qualifier("general")
    private IExecute            executeLoc;

    public void run() {
        String execute2Loc = this.executeLoc.execute();
        if (FactoryRunner.logger.isInfoEnabled()) {
            FactoryRunner.logger.info("[FactoryRunner][run]-> " + execute2Loc);
        }

    }

    public static void main(final String[] args) {
        FactoryRunner factoryRunnerLoc = new FactoryRunner();
        factoryRunnerLoc.run();
    }
}
