package com.training.turkcell.behavior.command;

import java.util.Scanner;

public class WithdrawCommand implements IATMCommand {

    @Override
    public void execute(final Scanner scannerParam,
                        final Musteri customerParam) {
        System.out.println("Çekilecek miktar :");
        int withdrawLoc = scannerParam.nextInt();
        customerParam.setAmount(customerParam.getAmount() - withdrawLoc);
    }

    @Override
    public String getDesc() {
        return "Para çek";
    }

}
