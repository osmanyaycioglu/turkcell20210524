package com.training.turkcell.dp.creation.abstractfactory;


public class LabelFactory {

    public static ILabelRender createLabelRender(final int themeType) {
        switch (themeType) {
            case IThemeConstant.BLUE_THEME:
                return new BlueLabel();
            case IThemeConstant.RED_THEME:
                return new RedLabel();
            default:
                return new BlueLabel();
        }
    }
}
