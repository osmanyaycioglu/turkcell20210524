package com.training.turkcell.structure.tests.composite;


public class ErrorRunner {

    public static void main(final String[] args) {
        Error errorLoc = new Error().setMicroservice("MS1")
                                    .setBoundedContext("B1")
                                    .setErrorDesc("Başka MS çağırırken problem oldu")
                                    .setErrorCause(100)
                                    .addSubError(new Error().setMicroservice("MS2")
                                                            .setBoundedContext("B1")
                                                            .setErrorDesc("Validasyon Erorü")
                                                            .setErrorCause(120)
                                                            .addSubError(new Error().setMicroservice("MS2")
                                                                                    .setBoundedContext("B1")
                                                                                    .setErrorDesc("Name yanlışgeldi")
                                                                                    .setErrorCause(121))
                                                            .addSubError(new Error().setMicroservice("MS2")
                                                                                    .setBoundedContext("B1")
                                                                                    .setErrorDesc("Surname yanlışgeldi")
                                                                                    .setErrorCause(121)));

        System.out.println("Errors : " + errorLoc.toFormattedStr(""));
    }
}
