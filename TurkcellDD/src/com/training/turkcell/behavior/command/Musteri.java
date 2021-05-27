package com.training.turkcell.behavior.command;

public class Musteri {

    private String name;
    private int    amount;

    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }


    public int getAmount() {
        return this.amount;
    }


    public void setAmount(final int amountParam) {
        this.amount = amountParam;
    }

    @Override
    public String toString() {
        StringBuilder builderLoc = new StringBuilder();
        builderLoc.append("Musteri [name=");
        builderLoc.append(this.name);
        builderLoc.append(", amount=");
        builderLoc.append(this.amount);
        builderLoc.append("]");
        return builderLoc.toString();
    }


}
