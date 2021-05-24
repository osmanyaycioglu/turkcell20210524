package com.training.turkcell.dp.creation;


public class ConnectionInfo2 {

    private final String name;
    private final String desc;
    private final String ip;
    private final int    port;
    private String       testStr           = "select 1";
    private long         connectionTimeout = 3000;


    private ConnectionInfo2(final String nameParam,
                            final String descParam,
                            final String ipParam,
                            final int portParam) {
        super();
        this.name = nameParam;
        this.desc = descParam;
        this.ip = ipParam;
        this.port = portParam;
    }

    private ConnectionInfo2(final String nameParam,
                            final String descParam,
                            final String ipParam,
                            final int portParam,
                            final String testStrParam,
                            final long connectionTimeoutParam) {
        super();
        this.name = nameParam;
        this.desc = descParam;
        this.ip = ipParam;
        this.port = portParam;
        this.testStr = testStrParam;
        this.connectionTimeout = connectionTimeoutParam;
    }

    public static ConnectionInfo2 createConnectionInfo2Type2(final String nameParam,
                                                             final String descParam,
                                                             final String ipParam,
                                                             final int portParam,
                                                             final String testStrParam,
                                                             final long connectionTimeoutParam) {
        return new ConnectionInfo2(nameParam,
                                   descParam,
                                   ipParam,
                                   portParam,
                                   testStrParam,
                                   connectionTimeoutParam);
    }


    public String getName() {
        return this.name;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getIp() {
        return this.ip;
    }

    public int getPort() {
        return this.port;
    }

    public String getTestStr() {
        return this.testStr;
    }


    public long getConnectionTimeout() {
        return this.connectionTimeout;
    }


}
