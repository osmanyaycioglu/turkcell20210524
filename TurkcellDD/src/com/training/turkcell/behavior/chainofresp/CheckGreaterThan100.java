package com.training.turkcell.behavior.chainofresp;


public class CheckGreaterThan100 implements ICheckNumber {

    private final ICheckNumber nextCheckNumber;

    public CheckGreaterThan100(final ICheckNumber nextCheckNumberParam) {
        super();
        this.nextCheckNumber = nextCheckNumberParam;
    }

    @Override
    public void check(final int numberParam) {
        if (numberParam > 100) {
            System.out.println("rakam 100 den büyük");
        } else {
            if (this.nextCheckNumber != null) {
                this.nextCheckNumber.check(numberParam);
            }
        }
    }


}
