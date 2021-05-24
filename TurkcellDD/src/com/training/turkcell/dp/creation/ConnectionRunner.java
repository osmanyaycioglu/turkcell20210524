package com.training.turkcell.dp.creation;


public class ConnectionRunner {

    public static void main(final String[] args) {
        ConnectionInfo connectionInfoLoc = new ConnectionInfo("name1",
                                                              "xyz",
                                                              "192.168.1.2",
                                                              10_000);

        ConnectionInfo connectionInfoLoc2 = new ConnectionInfo("name1",
                                                               "xyz",
                                                               "192.168.1.2",
                                                               10_000,
                                                               "select 2",
                                                               4_000);

        ConnectionInfo2 connectionInfo2Loc = ConnectionInfo2.createConnectionInfo2Type2("name1",
                                                                                        "xyz",
                                                                                        "192.168.1.2",
                                                                                        10_000,
                                                                                        "select 2",
                                                                                        4_000);


        ConnectionInfoBetter cb = new ConnectionInfoBetter().setName("con1")
                                                            .setDesc("connection 1")
                                                            .setIp("192.168.1.1")
                                                            .setPort(8080)
                                                            .setTestStr("select 3")
                                                            .setConnectionTimeout(3000);
    }
}
