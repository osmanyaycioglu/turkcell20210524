package com.training.turkcell.dp.creation.abstractfactory;


public class BlueAbstractFactory implements IRender {

    @Override
    public IButtonRender buttonRender() {
        return new BlueButton();
    }

    @Override
    public ILabelRender labelRender() {
        return new BlueLabel();
    }

}
