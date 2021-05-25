package com.training.turkcell.dp.creation.objectpool;


public class OPRunner {

    public static void main(final String[] args) {
        ConnectionManager connectionManagerLoc = new ConnectionManager();
        for (int iLoc = 0; iLoc < 1_000; iLoc++) {
            try (Connection connectionLoc = connectionManagerLoc.getConnection();) {
                System.out.println("con : " + connectionLoc.getId());
            } catch (Exception eLoc) {
                // TODO: handle exception
            }
        }
    }
}
