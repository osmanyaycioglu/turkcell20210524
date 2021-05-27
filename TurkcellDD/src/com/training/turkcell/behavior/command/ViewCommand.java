package com.training.turkcell.behavior.command;

import java.util.Scanner;

public class ViewCommand implements IATMCommand {

    @Override
    public void execute(final Scanner scannerParam,
                        final Musteri customerParam) {
        System.out.println("Hesabınız : " + customerParam);
    }

    @Override
    public String getDesc() {
        return "Hesap bilgisi";
    }

}
