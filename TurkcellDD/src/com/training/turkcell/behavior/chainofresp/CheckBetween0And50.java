package com.training.turkcell.behavior.chainofresp;


public class CheckBetween0And50 implements ICheckNumber {

    private final ICheckNumber nextCheckNumber;

    public CheckBetween0And50(final ICheckNumber nextCheckNumberParam) {
        super();
        this.nextCheckNumber = nextCheckNumberParam;
    }

    @Override
    public void check(final int numberParam) {
        if ((numberParam > 0) && (numberParam < 50)) {
            System.out.println("rakam 0 ile 50 arasında");
        } else {
            if (this.nextCheckNumber != null) {
                this.nextCheckNumber.check(numberParam);
            }
        }
    }


}
