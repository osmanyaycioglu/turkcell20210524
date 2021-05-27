package com.training.turkcell.behavior.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorRun {

    public static void main(final String[] args) {
        List<String> myListLoc = Arrays.asList("osman",
                                               "ali",
                                               "veli");
        Iterator<String> iteratorLoc = myListLoc.iterator();
        for (String stringLoc : myListLoc) {

        }
    }
}
