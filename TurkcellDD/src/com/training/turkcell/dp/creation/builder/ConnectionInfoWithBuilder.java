package com.training.turkcell.dp.creation.builder;


public class ConnectionInfoWithBuilder {

    private final String name;
    private final String desc;
    private final String ip;
    private final int    port;
    private final String testStr;
    private final long   connectionTimeout;


    private ConnectionInfoWithBuilder(final String nameParam,
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

    // Builder class dönüşü
    public static ConnectionInfoWithBuilderHelper getBuilder() {
        return new ConnectionInfoWithBuilderHelper();
    }

    public static class ConnectionInfoWithBuilderHelper {

        private String name;
        private String desc;
        private String ip;
        private int    port;
        private String testStr;
        private long   connectionTimeout;


        private ConnectionInfoWithBuilderHelper() {
        }

        public String getName() {
            return this.name;
        }

        public ConnectionInfoWithBuilderHelper withName(final String nameParam) {
            this.name = nameParam;
            return this;
        }

        public String getDesc() {
            return this.desc;
        }

        public ConnectionInfoWithBuilderHelper withDesc(final String descParam) {
            this.desc = descParam;
            return this;
        }

        public String getIp() {
            return this.ip;
        }

        public ConnectionInfoWithBuilderHelper withIp(final String ipParam) {
            this.ip = ipParam;
            return this;
        }

        public int getPort() {
            return this.port;
        }

        public ConnectionInfoWithBuilderHelper withPort(final int portParam) {
            this.port = portParam;
            return this;
        }

        public String getTestStr() {
            return this.testStr;
        }

        public ConnectionInfoWithBuilderHelper withOptionalTestStr(final String testStrParam) {
            this.testStr = testStrParam;
            return this;
        }

        public long getConnectionTimeout() {
            return this.connectionTimeout;
        }

        public ConnectionInfoWithBuilderHelper withOptionalConnectionTimeout(final long connectionTimeoutParam) {
            this.connectionTimeout = connectionTimeoutParam;
            return this;
        }

        public ConnectionInfoWithBuilder buildType1() {
            return this.createObject("select 1",
                                     1000);
        }

        private ConnectionInfoWithBuilder createObject(final String str,
                                                       final long conTimeout) {
            if (this.testStr == null) {
                this.testStr = str;
            }
            if (this.connectionTimeout < conTimeout) {
                this.connectionTimeout = conTimeout;
            }
            ConnectionInfoWithBuilder builderLoc = new ConnectionInfoWithBuilder(this.name,
                                                                                 this.desc,
                                                                                 this.ip,
                                                                                 this.port,
                                                                                 this.testStr,
                                                                                 this.connectionTimeout);
            return builderLoc;
        }

        public ConnectionInfoWithBuilder buildType2() {
            return this.createObject("select * from dual",
                                     2000);
        }

    }

}
