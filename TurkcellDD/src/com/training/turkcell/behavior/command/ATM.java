package com.training.turkcell.behavior.command;

import java.util.Scanner;

public class ATM {

    public static void main(final String[] args) {
        Musteri musteriLoc = new Musteri();
        musteriLoc.setName("osman");
        musteriLoc.setAmount(1_000);
        try (Scanner scannerLoc = new Scanner(System.in)) {
            while (true) {
                System.out.println(musteriLoc);
                System.out.println("1-para cek");
                System.out.println("2-para yatır");
                System.out.println("3-Hesap bilgisi");
                System.out.println("seçiminiz:");
                int nextIntLoc = scannerLoc.nextInt();
                switch (nextIntLoc) {
                    case 1:
                        System.out.println("Çekilecek miktar :");
                        int withdrawLoc = scannerLoc.nextInt();
                        musteriLoc.setAmount(musteriLoc.getAmount() - withdrawLoc);
                        break;
                    case 2:
                        System.out.println("Yatıralacak miktar :");
                        int depositLoc = scannerLoc.nextInt();
                        musteriLoc.setAmount(musteriLoc.getAmount() + depositLoc);
                        break;
                    case 3:
                        System.out.println("Hesabınız : " + musteriLoc);
                        break;

                    default:
                        break;
                }
            }
        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        }
    }
}
