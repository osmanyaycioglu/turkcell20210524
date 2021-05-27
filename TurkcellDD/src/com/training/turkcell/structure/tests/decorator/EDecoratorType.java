package com.training.turkcell.structure.tests.decorator;


public enum EDecoratorType {

    SAYIN(CustomerSayinDecorator.class),
    GENDER(CustomerGenderDecorator.class),
    HAZRETLERI(CustomerHazretleriDecorator.class),
    XYZ(CustomerXYZDecorator.class);

    private final Class<CustomerDecorator> class1;

    EDecoratorType(final Class<? extends CustomerDecorator> classParam) {
        this.class1 = (Class<CustomerDecorator>) classParam;
    }

    public Class<CustomerDecorator> getClass1() {
        return this.class1;
    }
}
