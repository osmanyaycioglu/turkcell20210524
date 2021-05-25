package com.training.spring;


public class ExecuteMenu {

    public static String getMenu() {
        StringBuilder builderLoc = new StringBuilder();
        builderLoc.append("Menu:\n");
        builderLoc.append("1-İngilizce\n");
        builderLoc.append("2-Türkçe\n");
        builderLoc.append("3-İspanyolca\n");
        builderLoc.append("4-Japonca\n");
        builderLoc.append("5-Çince\n");
        builderLoc.append("seçiminiz:");
        return builderLoc.toString();
    }
}
