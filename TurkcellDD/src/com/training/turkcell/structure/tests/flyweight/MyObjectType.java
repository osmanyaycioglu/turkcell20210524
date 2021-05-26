package com.training.turkcell.structure.tests.flyweight;


public class MyObjectType {

    private EObjectType objType;
    private String      typeName;
    private String      typeDescription;
    private String      typeRule;
    private String      typeScpript;

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

}
