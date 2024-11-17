package org.example.structural.flyweight;

public class Test {
    public static void main(String[] args) {
        Integer x = 120;
        Integer y = 120;

        System.out.println(x == y);

        Integer z = 250;
        Integer w = 250;
        System.out.println(z == w);
    }
}
