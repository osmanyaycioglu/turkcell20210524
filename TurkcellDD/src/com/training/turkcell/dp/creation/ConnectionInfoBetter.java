package com.training.turkcell.dp.creation;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ConnectionInfoBetter {

    private String name;
    private String desc;
    private String ip;
    private int    port;
    private String testStr           = "select 1";
    private long   connectionTimeout = 3000;

    List<String>   strA              = new ArrayList<>();

    public String getName() {
        return this.name;
    }

    public void concur() {
        this.strA.add("" + new Random().nextInt());
    }

    public ConnectionInfoBetter setName(final String nameParam) {
        this.name = nameParam;
        return this;
    }

    public String getDesc() {
        return this.desc;
    }

    public ConnectionInfoBetter setDesc(final String descParam) {
        this.desc = descParam;
        return this;
    }

    public String getIp() {
        return this.ip;
    }

    public ConnectionInfoBetter setIp(final String ipParam) {
        this.ip = ipParam;
        return this;
    }

    public int getPort() {
        return this.port;
    }

    public ConnectionInfoBetter setPort(final int portParam) {
        this.port = portParam;
        return this;
    }

    public String getTestStr() {
        return this.testStr;
    }

    public ConnectionInfoBetter setTestStr(final String testStrParam) {
        this.testStr = testStrParam;
        return this;
    }

    public long getConnectionTimeout() {
        return this.connectionTimeout;
    }

    public ConnectionInfoBetter setConnectionTimeout(final long connectionTimeoutParam) {
        this.connectionTimeout = connectionTimeoutParam;
        return this;
    }

}
