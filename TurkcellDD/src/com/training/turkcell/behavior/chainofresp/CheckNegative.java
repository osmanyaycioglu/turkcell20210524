package com.training.turkcell.behavior.chainofresp;


public class CheckNegative implements ICheckNumber {

    private final ICheckNumber nextCheckNumber;

    public CheckNegative(final ICheckNumber nextCheckNumberParam) {
        super();
        this.nextCheckNumber = nextCheckNumberParam;
    }

    @Override
    public void check(final int numberParam) {
        if (numberParam < 0) {
            System.out.println("rakam negatif");
        } else {
            if (this.nextCheckNumber != null) {
                this.nextCheckNumber.check(numberParam);
            }
        }
    }


}
