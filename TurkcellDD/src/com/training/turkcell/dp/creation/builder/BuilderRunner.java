package com.training.turkcell.dp.creation.builder;

public class BuilderRunner {

    public static void main(final String[] args) {
        ConnectionInfoWithBuilder immutableConnectionInfo = ConnectionInfoWithBuilder.getBuilder()
                                                                                     .withName("con1")
                                                                                     .withDesc("connection 1")
                                                                                     .withIp("192.168.1.1")
                                                                                     .withPort(8080)
                                                                                     .withOptionalConnectionTimeout(3000)
                                                                                     .withOptionalTestStr("select 1")
                                                                                     .buildType1();
        ConnectionInfoWithBuilder immutableConnectionInfo2 = ConnectionInfoWithBuilder.getBuilder()
                                                                                      .withName("con1")
                                                                                      .withDesc("connection 1")
                                                                                      .withIp("192.168.1.1")
                                                                                      .withPort(8080)
                                                                                      .buildType2();
    }
}
