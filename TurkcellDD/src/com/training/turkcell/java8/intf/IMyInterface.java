package com.training.turkcell.java8.intf;


public interface IMyInterface {

    String proc();

    default String helpProc() {
        System.out.println("help proc dayım");
        String procLoc = this.proc();
        return procLoc.substring(1);
    }

    public static boolean isEmpty(final String str) {
        return (str == null) || str.isEmpty();
    }

}
