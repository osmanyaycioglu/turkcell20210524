package com.training.turkcell.dp.creation.factory;


public class ExecuteFactory {

    public static IExecute create(final int nextIntLoc) {
        IExecute executeLoc = null;
        switch (nextIntLoc) {
            case 1:
                executeLoc = new ExecuteENG();
                break;
            case 2:
                executeLoc = new ExecuteTR();
                break;
            case 3:
                executeLoc = new ExecuteESP();
                break;
            case 4:
                executeLoc = new ExecuteESP();
                break;
            case 5:
                executeLoc = new ExecuteCN();
                break;
            default:
                executeLoc = new ExecuteENG();
                break;
        }
        return executeLoc;
    }

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
