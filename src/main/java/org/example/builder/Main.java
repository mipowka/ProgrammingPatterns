package org.example.builder;

public class Main {
    public static void main(String[] args) {
        Product product = new Product.ProductBuilder()
                .setId(1)
                .setName("Milk")
                .setPrice(88.99)
                .build();
        System.out.println(product);
    }
}
