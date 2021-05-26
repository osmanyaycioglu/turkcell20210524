package com.training.spring.rest;


public class StrTest {

    public static void main(final String[] args) {
        long delta = System.currentTimeMillis();
        //        StringBuilder builderLoc = new StringBuilder(10_000_000);
        String string = "";
        for (int iLoc = 0; iLoc < 1_000_000; iLoc++) {
            string += "osman " + iLoc;
            //            builderLoc.append("osman ")
            //                      .append(iLoc);
            // String string = "osman " + iLoc;
            //            String string = String.format("osman %d",
            //                                          iLoc);
        }
        System.out.println("Delta : " + (System.currentTimeMillis() - delta));
        try {
            Thread.sleep(5000);
        } catch (Exception eLoc) {
            // TODO: handle exception
        }
        System.gc();
        try {
            Thread.sleep(5000);
        } catch (Exception eLoc) {
            // TODO: handle exception
        }
        delta = System.currentTimeMillis();
        //        builderLoc = new StringBuilder(10_000_000);
        for (int iLoc = 0; iLoc < 1_000_000; iLoc++) {
            //            builderLoc.append("osman ")
            //                      .append(iLoc);
            //String string = "osman " + iLoc;
            //            String string = String.format("osman %d",
            //                                          iLoc);
        }
        System.out.println("Delta2 : " + (System.currentTimeMillis() - delta));

    }

}

