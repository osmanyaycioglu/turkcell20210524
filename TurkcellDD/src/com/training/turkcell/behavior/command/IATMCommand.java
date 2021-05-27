package com.training.turkcell.behavior.command;

import java.util.Scanner;


public interface IATMCommand {

    void execute(Scanner scannerParam,
                 Musteri customerParam);

    String getDesc();
}
