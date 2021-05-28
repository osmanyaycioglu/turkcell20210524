package com.training.turkcell.behavior.chainofresp;

import java.util.Scanner;

public class CheckNumbers {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Rakam:");
        int nextIntLoc = scanner.nextInt();

        ICheckNumber checkNumberLoc = new CheckNegative(new CheckBetween0And50(new CheckBetween50And100(new CheckGreaterThan100(new CheckNotProc()))));
        checkNumberLoc.check(nextIntLoc);

        if (args[0].equals("on")) {
            if ((nextIntLoc > 0) && (nextIntLoc < 50)) {
                System.out.println("rakam 0 ile 50 arasında");
            } else if ((nextIntLoc >= 50) && (nextIntLoc < 100)) {
                System.out.println("rakam 50 ile 100 arasında");
            } else if (nextIntLoc >= 100) {
                System.out.println("rakam 100 den büyük");
            } else if (nextIntLoc < 0) {
                System.out.println("rakam negatif");
            }
        } else if (args[0].equals("off")) {
            if ((nextIntLoc > 0) && (nextIntLoc < 30)) {
                System.out.println("rakam 0 ile 30 arasında");
            } else if ((nextIntLoc >= 30) && (nextIntLoc < 100)) {
                System.out.println("rakam 30 ile 100 arasında");
            } else if ((nextIntLoc >= 50) && (nextIntLoc < 100)) {
                System.out.println("rakam 50 ile 100 arasında");
            } else if (nextIntLoc >= 100) {
                System.out.println("rakam 100 den büyük");
            } else if (nextIntLoc < 0) {
                System.out.println("rakam negatif");
            }
        }


    }
}
