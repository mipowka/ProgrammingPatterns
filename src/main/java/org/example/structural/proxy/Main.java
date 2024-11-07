package org.example.structural.proxy;

public class Main {
    public static void main(String[] args) {
        String fileName = "a fat cat";
        Image image = new ProxyImage(fileName);

        image.display();
    }
}
