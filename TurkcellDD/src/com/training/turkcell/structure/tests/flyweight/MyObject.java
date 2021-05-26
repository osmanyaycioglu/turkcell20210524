package com.training.turkcell.structure.tests.flyweight;


public class MyObject {

    private String       name;
    private String       text;
    private String       number;
    private int          port;
    private MyObjectType myObjectType;

    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    public String getText() {
        return this.text;
    }

    public void setText(final String textParam) {
        this.text = textParam;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(final String numberParam) {
        this.number = numberParam;
    }

    public int getPort() {
        return this.port;
    }

    public void setPort(final int portParam) {
        this.port = portParam;
    }

    public MyObjectType getMyObjectType() {
        return this.myObjectType;
    }

    public void setMyObjectType(final MyObjectType myObjectTypeParam) {
        this.myObjectType = myObjectTypeParam;
    }

}
