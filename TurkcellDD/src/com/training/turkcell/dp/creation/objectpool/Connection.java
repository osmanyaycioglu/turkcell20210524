package com.training.turkcell.dp.creation.objectpool;

import java.io.Closeable;
import java.util.UUID;

public class Connection implements Closeable {

    private String                  ip;
    private String                  port;
    private final ConnectionManager connectionManager;
    private final String            uid = UUID.randomUUID()
                                              .toString();

    public Connection(final ConnectionManager connectionManagerParam) {
        super();

        this.connectionManager = connectionManagerParam;
    }

    public String getIp() {
        return this.ip;
    }

    public void setIp(final String ipParam) {
        this.ip = ipParam;
    }

    public String getPort() {
        return this.port;
    }

    public void setPort(final String portParam) {
        this.port = portParam;
    }

    public void connect() {
        System.out.println("Connection açılıyor");
    }

    @Override
    public void close() {
        System.out.println("Connection kapandı");
        this.connectionManager.returnToQueue(this);
    }

    public String getId() {
        return this.uid;
    }

}
