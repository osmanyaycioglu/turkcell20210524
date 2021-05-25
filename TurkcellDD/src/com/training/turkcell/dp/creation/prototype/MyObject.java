package com.training.turkcell.dp.creation.prototype;


public class MyObject {

    private String      name;
    private String      text;
    private String      number;
    private int         port;
    private EObjectType objType;
    private String      typeName;
    private String      typeDescription;
    private String      typeRule;
    private String      typeScpript;


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

    public EObjectType getObjType() {
        return this.objType;
    }

    public void setObjType(final EObjectType objTypeParam) {
        this.objType = objTypeParam;
    }


    public String getTypeName() {
        return this.typeName;
    }


    public void setTypeName(final String typeNameParam) {
        this.typeName = typeNameParam;
    }


    public String getTypeDescription() {
        return this.typeDescription;
    }


    public void setTypeDescription(final String typeDescriptionParam) {
        this.typeDescription = typeDescriptionParam;
    }


    public String getTypeRule() {
        return this.typeRule;
    }


    public void setTypeRule(final String typeRuleParam) {
        this.typeRule = typeRuleParam;
    }


    public String getTypeScpript() {
        return this.typeScpript;
    }


    public void setTypeScpript(final String typeScpriptParam) {
        this.typeScpript = typeScpriptParam;
    }

    public MyObject cloneMe() {
        MyObject myObjectLoc = new MyObject();
        myObjectLoc.typeName = this.typeName;
        myObjectLoc.typeDescription = this.typeDescription;
        myObjectLoc.typeRule = this.typeRule;
        myObjectLoc.typeScpript = this.typeScpript;
        return myObjectLoc;
    }

}
