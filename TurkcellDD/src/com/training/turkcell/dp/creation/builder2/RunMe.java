package com.training.turkcell.dp.creation.builder2;


public class RunMe {

    public static void main(final String[] args) {
        Customer buildLoc = Customer.getBuilder()
                                    .withName("osman")
                                    .withSurname("yay")
                                    .withAddress("addre1")
                                    .withCity("ist")
                                    .withPhone()
                                    .withPhoneName("ev")
                                    .withPhoneNumber(8080)
                                    .add()
                                    .withPhone()
                                    .withPhoneName("office")
                                    .withPhoneNumber(8081)
                                    .add()
                                    .build();
    }
}
