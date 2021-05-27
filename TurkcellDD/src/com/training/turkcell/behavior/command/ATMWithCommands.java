package com.training.turkcell.behavior.command;

import java.util.List;
import java.util.Scanner;

public class ATMWithCommands {

    public static void main(final String[] args) {
        Musteri musteriLoc = new Musteri();
        musteriLoc.setName("osman");
        musteriLoc.setAmount(1_000);
        List<IATMCommand> commands = CommandFactory.createCommands();
        try (Scanner scannerLoc = new Scanner(System.in)) {
            while (true) {
                System.out.println(musteriLoc);
                int index = 1;
                for (IATMCommand iatmCommandLoc : commands) {
                    System.out.println(index + "-" + iatmCommandLoc.getDesc());
                    index++;
                }
                System.out.println("seçiminiz:");
                int nextIntLoc = scannerLoc.nextInt();
                IATMCommand iatmCommandLoc = commands.get(nextIntLoc - 1);
                iatmCommandLoc.execute(scannerLoc,
                                       musteriLoc);
            }
        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        }
    }
}
