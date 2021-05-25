package com.training.turkcell.dp.creation.singleton;


public enum FinalSingleton {

    INSTANCE1("test instance"),
    INSTANCE2("live instance") {

        @Override
        public void hello() {
            System.out.println("Hello from final instance 2 singleton");
        }
    };

    private final String string;

    private FinalSingleton(final String stringParam) {
        this.string = stringParam;

    }

    public void hello() {
        System.out.println("Hello from final singleton");
    }

    public String getString() {
        return this.string;
    }

}
