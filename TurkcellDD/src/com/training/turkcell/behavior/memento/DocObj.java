package com.training.turkcell.behavior.memento;


public class DocObj {

    private String text;
    private String name;
    private String description;

    public String getText() {
        return this.text;
    }

    public void setText(final String textParam) {
        this.text = textParam;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(final String descriptionParam) {
        this.description = descriptionParam;
    }

    @Override
    public String toString() {
        StringBuilder builderLoc = new StringBuilder();
        builderLoc.append("DocObj [text=");
        builderLoc.append(this.text);
        builderLoc.append(", name=");
        builderLoc.append(this.name);
        builderLoc.append(", description=");
        builderLoc.append(this.description);
        builderLoc.append("]");
        return builderLoc.toString();
    }


}
