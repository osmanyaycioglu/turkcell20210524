package com.training.turkcell.structure.tests;

import com.training.turkcell.structure.tests.proxy.PrintSystemProxy;
import com.training.turkcell.structure.tests.proxy.PrintSystemTestProxy;

public class PrintSystemFactory {

    private static final int PRINT_NORMAL      = 1;
    private static final int PRINT_PROXY       = 2;
    private static final int PRINT_PROXY_TRANS = 3;

    public static int        systemPrintType   = PrintSystemFactory.PRINT_NORMAL;

    public static IPrintSystem createPrintSystem() {
        switch (PrintSystemFactory.systemPrintType) {
            case PRINT_NORMAL:
                return new PrintSystem();
            case PRINT_PROXY:
                return new PrintSystemProxy();
            case PRINT_PROXY_TRANS:
                return new PrintSystemTestProxy();

            default:
                return new PrintSystem();
        }
    }
}
