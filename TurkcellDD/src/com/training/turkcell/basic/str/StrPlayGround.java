package com.training.turkcell.basic.str;

import java.security.SecureRandom;

public class StrPlayGround {

    public static void main(final String[] args) {
        SecureRandom randomLoc = new SecureRandom();
        StringBuilder builderLoc = new StringBuilder(512);
        for (int iLoc = 0; iLoc < 100; iLoc++) {
            builderLoc.append("osman");
            builderLoc.append("id:");
            builderLoc.append(randomLoc.nextInt());
        }
        String str1 = "";
        for (int iLoc = 0; iLoc < 100; iLoc++) {
            str1 += "osman id:" + randomLoc.nextInt();
        }

        StringBuilder builderLoc2 = new StringBuilder(50);
        builderLoc2.append("osman");
        builderLoc2.append("id:");
        builderLoc2.append(randomLoc.nextInt());
        builderLoc2.append("dsfsd");

        String str2 = "osman id:" + randomLoc.nextInt() + " djshfsd ";
        str2 += " dsfsd";


    }


}
