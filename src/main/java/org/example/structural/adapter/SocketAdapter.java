package org.example.structural.adapter;

public class SocketAdapter implements EuSocket{
    private UsSocket usSocket;

    public SocketAdapter(UsSocket usSocket) {
        this.usSocket = usSocket;
    }

    @Override
    public void provide220() {
        System.out.println("Converting 110V to 220V");
        usSocket.provide110();
    }
}
