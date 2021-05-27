package com.training.turkcell.structure.tests.decorator;

import java.lang.reflect.Constructor;
import java.util.List;

import com.training.turkcell.structure.tests.Customer;

public class CustomerDecoratorFactory {

    public static Customer createDcorators(final List<EDecoratorType> decorators,
                                           final Customer customerParam) throws Exception {
        Customer instance = customerParam;
        for (EDecoratorType cdLoc : decorators) {
            Class<CustomerDecorator> class1Loc = cdLoc.getClass1();
            Constructor<CustomerDecorator> constructorLoc = class1Loc.getConstructor(Customer.class);
            instance = constructorLoc.newInstance(instance);
        }
        return instance;
    }
}
