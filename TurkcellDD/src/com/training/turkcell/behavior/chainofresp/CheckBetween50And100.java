package com.training.turkcell.behavior.chainofresp;


public class CheckBetween50And100 implements ICheckNumber {

    private final ICheckNumber nextCheckNumber;

    public CheckBetween50And100(final ICheckNumber nextCheckNumberParam) {
        super();
        this.nextCheckNumber = nextCheckNumberParam;
    }

    @Override
    public void check(final int numberParam) {
        if ((numberParam > 50) && (numberParam < 100)) {
            System.out.println("rakam 50 ile 100 arasında");
        } else {
            if (this.nextCheckNumber != null) {
                this.nextCheckNumber.check(numberParam);
            }
        }
    }


}
