package com.training.turkcell.dp.creation.abstractfactory;


public class RenderFactory {

    public static IRender createRender(final int themeType) {
        switch (themeType) {
            case IThemeConstant.BLUE_THEME:
                return new BlueAbstractFactory();
            case IThemeConstant.RED_THEME:
                return new RedAbstractFactory();
            default:
                return new BlueAbstractFactory();
        }
    }
}
