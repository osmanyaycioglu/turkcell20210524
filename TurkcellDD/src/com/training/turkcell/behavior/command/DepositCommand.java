package com.training.turkcell.behavior.command;

import java.util.Scanner;

public class DepositCommand implements IATMCommand {

    @Override
    public void execute(final Scanner scannerParam,
                        final Musteri customerParam) {
        System.out.println("Yatıralacak miktar :");
        int depositLoc = scannerParam.nextInt();
        customerParam.setAmount(customerParam.getAmount() + depositLoc);
    }

    @Override
    public String getDesc() {
        return "Para yatır";
    }

}
