package com.training.turkcell.dp.creation.abstractfactory;


public class RedAbstractFactory implements IRender {

    @Override
    public IButtonRender buttonRender() {
        return new RedButton();
    }

    @Override
    public ILabelRender labelRender() {
        return new RedLabel();
    }

}
