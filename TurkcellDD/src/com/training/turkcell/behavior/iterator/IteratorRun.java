package com.training.turkcell.behavior.iterator;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class IteratorRun {

    public static void main(final String[] args) {
        MyObjIter myObjLoc = new MyObjIter();
        myObjLoc.add("osman");
        myObjLoc.add("ali");
        myObjLoc.add("veli");

        Iterator<String> iteratorLoc = myObjLoc.iterator();
        while (iteratorLoc.hasNext()) {
            String nextLoc = iteratorLoc.next();
            System.out.println(nextLoc);
        }


        for (String stringLoc : myObjLoc) {
            System.out.println(stringLoc);
        }

        List<String> strListLoc = new CopyOnWriteArrayList<>();


    }
}
