package com.training.turkcell.structure.tests.decorator;

import java.util.ArrayList;
import java.util.List;

import com.training.turkcell.structure.tests.Customer;
import com.training.turkcell.structure.tests.PrintSystem;

public class DecoratorRun {

    public static void main(final String[] args) {
        Customer customerLoc = new Customer();
        customerLoc.setName("osman");
        customerLoc.setSurname("yay");
        customerLoc.setGender("erkek");

        Customer customerDecLoc = new CustomerHazretleriDecorator(new CustomerSayinDecorator(new CustomerGenderDecorator(customerLoc)));
        PrintSystem printSystemLoc = new PrintSystem();
        printSystemLoc.print(customerDecLoc);

        List<EDecoratorType> decoratorTypesLoc = new ArrayList<>();
        decoratorTypesLoc.add(EDecoratorType.GENDER);
        decoratorTypesLoc.add(EDecoratorType.XYZ);
        decoratorTypesLoc.add(EDecoratorType.HAZRETLERI);
        decoratorTypesLoc.add(EDecoratorType.SAYIN);
        try {
            Customer createDcoratorsLoc = CustomerDecoratorFactory.createDcorators(decoratorTypesLoc,
                                                                                   customerLoc);
            printSystemLoc.print(createDcoratorsLoc);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }
}
