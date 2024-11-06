package org.example.singleton;

public class Service {
    private static final int MAX_CONNECTION = 28;
    private int connectionsNow;
    private int connectionId;
    private int connectionPort;
    private static Service service;
    private boolean status;

    //builder to read to check
    //порождающие структурные и поведенческие паттерны почему

    private Service(int connectionId, int connectionPort, int connectionsNow) {
        this.connectionId = connectionId;
        this.connectionPort = connectionPort;
        this.connectionsNow = connectionsNow;
    }

    public static Service getInstance() {
        if (service == null) {
            synchronized (Service.class) {
                if (service == null) {
                    service = new Service(12, 5, 0);
                }
            }
        }
        return service;
    }

    public int getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(int connectionId) {
        this.connectionId = connectionId;
    }

    public int getConnectionPort() {
        return connectionPort;
    }

    public void setConnectionPort(int connectionPort) {
        this.connectionPort = connectionPort;
    }

    public int getConnectionsNow() {
        return connectionsNow;
    }

    public void setConnectionsNow(int connectionsNow) {
        this.connectionsNow = connectionsNow;
    }

    public int getMaxConnections() {
        return MAX_CONNECTION;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
