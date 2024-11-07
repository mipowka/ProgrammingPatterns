package org.example.structural.adapter;

public class EuDevice {
    private EuSocket socket;

    public EuDevice(EuSocket socket) {
        this.socket = socket;
    }

    void charge() {
        System.out.println("EU device is charging ");
        socket.provide220();
    }
}
