package com.training.turkcell.behavior.command;

import java.util.ArrayList;
import java.util.List;

public class CommandFactory {

    public static List<IATMCommand> createCommands() {
        List<IATMCommand> commands = new ArrayList<>();
        commands.add(new WithdrawCommand());
        commands.add(new DepositCommand());
        commands.add(new ViewCommand());
        return commands;
    }
}
