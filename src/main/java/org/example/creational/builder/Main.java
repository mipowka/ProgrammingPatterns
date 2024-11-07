package org.example.creational.builder;

public class Main {
    public static void main(String[] args) {
        Product product = Product.builder()
                .setId(1)
                .setName("Milk")
                .setPrice(88.99)
                .build();
        System.out.println(product);
    }
}
