package org.example.structural.adapter;

public class Main {
    public static void main(String[] args) {
        AmericanRealSocket socket = new AmericanRealSocket();
        SocketAdapter adapter = new SocketAdapter(socket);
        EuDevice device = new EuDevice(adapter);

        device.charge();
    }



}
