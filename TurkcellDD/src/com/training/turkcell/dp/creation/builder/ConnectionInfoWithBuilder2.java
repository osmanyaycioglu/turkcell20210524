package com.training.turkcell.dp.creation.builder;


public class ConnectionInfoWithBuilder2 {

    private String name;
    private String desc;
    private String ip;
    private int    port;
    private String testStr;
    private long   connectionTimeout;


    private ConnectionInfoWithBuilder2() {
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

    public static ConnectionInfoWithBuilderHelper getBuilder() {
        return new ConnectionInfoWithBuilderHelper();
    }

    public static class ConnectionInfoWithBuilderHelper {

        private final ConnectionInfoWithBuilder2 builder2 = new ConnectionInfoWithBuilder2();

        private ConnectionInfoWithBuilderHelper() {
        }

        public String getName() {
            return this.builder2.name;
        }

        public ConnectionInfoWithBuilderHelper withName(final String nameParam) {
            this.builder2.name = nameParam;
            return this;
        }

        public String getDesc() {
            return this.builder2.desc;
        }

        public ConnectionInfoWithBuilderHelper withDesc(final String descParam) {
            this.builder2.desc = descParam;
            return this;
        }

        public String getIp() {
            return this.builder2.ip;
        }

        public ConnectionInfoWithBuilderHelper withIp(final String ipParam) {
            this.builder2.ip = ipParam;
            return this;
        }

        public int getPort() {
            return this.builder2.port;
        }

        public ConnectionInfoWithBuilderHelper withPort(final int portParam) {
            this.builder2.port = portParam;
            return this;
        }

        public String getTestStr() {
            return this.builder2.testStr;
        }

        public ConnectionInfoWithBuilderHelper withOptionalTestStr(final String testStrParam) {
            this.builder2.testStr = testStrParam;
            return this;
        }

        public long getConnectionTimeout() {
            return this.builder2.connectionTimeout;
        }

        public ConnectionInfoWithBuilderHelper withOptionalConnectionTimeout(final long connectionTimeoutParam) {
            this.builder2.connectionTimeout = connectionTimeoutParam;
            return this;
        }

        public ConnectionInfoWithBuilder2 buildType1() {
            return this.createObject("select 1",
                                     1000);
        }

        private ConnectionInfoWithBuilder2 createObject(final String str,
                                                        final long conTimeout) {
            if (this.builder2.testStr == null) {
                this.builder2.testStr = str;
            }
            if (this.builder2.connectionTimeout < conTimeout) {
                this.builder2.connectionTimeout = conTimeout;
            }
            return this.builder2;
        }

        public ConnectionInfoWithBuilder2 buildType2() {
            return this.createObject("select * from dual",
                                     2000);
        }

    }

}
