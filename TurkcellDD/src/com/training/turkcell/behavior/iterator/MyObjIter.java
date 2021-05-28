package com.training.turkcell.behavior.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyObjIter implements Iterable<String> {

    private final List<String> myListLoc = new ArrayList<>();
    private String             name;
    private final Object       lockOject = new Object();

    public Iterator<String> getMyListLoc() {
        return this.myListLoc.iterator();
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    public void add(final String str) {
        synchronized (this.lockOject) {
            this.myListLoc.add(str);
        }
    }

    //    public Iterator<String> getIter() {
    //        return this.myListLoc.iterator();
    //    }

    @Override
    public Iterator<String> iterator() {
        return new MyIterator(this.myListLoc,
                              this.lockOject);
    }

    public static class MyIterator implements Iterator<String> {

        private final List<String> myListLoc;
        private int                current;
        private final Object       lockOject;


        public MyIterator(final List<String> myListLocParam,
                          final Object lockOjectParam) {
            super();
            this.lockOject = lockOjectParam;
            synchronized (this.lockOject) {
                this.myListLoc = new ArrayList<>(myListLocParam);
            }
        }

        @Override
        public boolean hasNext() {
            return this.current < this.myListLoc.size();
        }

        @Override
        public String next() {
            return this.myListLoc.get(this.current++);
        }

    }


}
