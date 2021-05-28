package com.training.turkcell.behavior.memento;


public class DocMemento {

    private final DocObj docObj;

    public DocMemento(final DocObj docObjParam) {
        super();
        this.docObj = new DocObj();
        this.getDocObj()
            .setText(docObjParam.getText());
        this.getDocObj()
            .setName(docObjParam.getName());
        this.getDocObj()
            .setDescription(docObjParam.getDescription());
    }

    public DocObj getDocObj() {
        return this.docObj;
    }

    @Override
    public String toString() {
        StringBuilder builderLoc = new StringBuilder();
        builderLoc.append("DocMemento [docObj=");
        builderLoc.append(this.docObj);
        builderLoc.append("]");
        return builderLoc.toString();
    }


}
