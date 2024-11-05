package org.example.singleton;

public class Main {
    public static void main(String[] args) {
        ConnectionManager connectionManager = new ConnectionManager();
        connectionManager.connectNewUser();
        connectionManager.isAvailable();
        connectionManager.disconnect();
    }
}
