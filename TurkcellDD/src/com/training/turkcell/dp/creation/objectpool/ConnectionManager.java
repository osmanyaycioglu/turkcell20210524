package com.training.turkcell.dp.creation.objectpool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ConnectionManager {

    private static final int                QUEUE_SIZE  = 100;
    private final BlockingQueue<Connection> connections = new ArrayBlockingQueue<>(ConnectionManager.QUEUE_SIZE);

    public ConnectionManager() {
        for (int iLoc = 0; iLoc < ConnectionManager.QUEUE_SIZE; iLoc++) {
            Connection connectionLoc = new Connection(this);
            connectionLoc.connect();
            this.connections.add(connectionLoc);
        }
    }

    public Connection getConnection() throws InterruptedException {
        return this.connections.take();
    }

    public void returnToQueue(final Connection connectionParam) {
        this.connections.add(connectionParam);
    }

}
