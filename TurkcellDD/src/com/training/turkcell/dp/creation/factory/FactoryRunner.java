package com.training.turkcell.dp.creation.factory;

import java.util.Scanner;

public class FactoryRunner {

    public void run() {
        //        Scanner scannerLoc2 = new Scanner(System.in);
        //        try {
        //
        //        } catch (Exception eLoc) {
        //            // TODO: handle exception
        //        } finally {
        //            if (scannerLoc2 != null) {
        //                scannerLoc2.close();
        //            }
        //        }
        //

        try (Scanner scannerLoc = new Scanner(System.in)) {
            while (true) {
                IExecute executeLoc = null;
                System.out.println(ExecuteFactory.getMenu());
                int nextIntLoc = scannerLoc.nextInt();
                //                switch (nextIntLoc) {
                //                    case 1:
                //                        executeLoc = new ExecuteENG();
                //                        break;
                //                    case 2:
                //                        executeLoc = new ExecuteTR();
                //                        break;
                //                    case 3:
                //                        executeLoc = new ExecuteESP();
                //                        break;
                //                    case 4:
                //                        executeLoc = new ExecuteJP();
                //                        break;
                //                    case 5:
                //                        executeLoc = new ExecuteCN();
                //                        break;
                //                    default:
                //                        executeLoc = new ExecuteENG();
                //                        break;
                //                }
                executeLoc = ExecuteFactory.create(nextIntLoc);
                // Poly yapı
                String execute2Loc = executeLoc.execute();
                if (execute2Loc.contains("jj")) {
                    execute2Loc.replace("jj",
                                        "mm");
                }
                System.out.println(executeLoc.execute());
            }

        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        }
    }

    public static void main(final String[] args) {
        FactoryRunner factoryRunnerLoc = new FactoryRunner();
        factoryRunnerLoc.run();
    }
}
