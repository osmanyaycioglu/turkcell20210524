package com.training.turkcell.dp.creation.abstractfactory;


public class ButtonFactory {

    public static IButtonRender createButtonRender(final int themeType) {
        switch (themeType) {
            case IThemeConstant.BLUE_THEME:
                return new BlueButton();
            case IThemeConstant.RED_THEME:
                return new RedButton();
            default:
                return new BlueButton();
        }
    }
}
