package org.example.structural.adapter;

public class AmericanRealSocket implements UsSocket{
    @Override
    public void provide110() {
        System.out.println("110 VOLT");
    }
}
