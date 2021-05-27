package com.training.turkcell.behavior.iterator;

import java.util.Iterator;
import java.util.List;

public class MyObjIter implements Iterable<String> {

    private List<String> myListLoc;
    private String       name;

    public Iterator<String> getMyListLoc() {
        return this.myListLoc.iterator();
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    @Override
    public boolean hasNext() {
        return this.myListLoc.iterator()
                             .hasNext();
    }

    @Override
    public String next() {
        return this.myListLoc.iterator()
                             .next();
    }

    @Override
    public Iterator<String> iterator() {
        // TODO Auto-generated method stub
        return null;
    }


}
