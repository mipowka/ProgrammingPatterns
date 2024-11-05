package org.example.builder;

public class Product {
    private final int id;
    private final String name;
    private final String description;
    private final double price;
    private final int quantity;
    private final double discount;

    public Product(ProductBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.description = builder.description;
        this.price = builder.price;
        this.quantity = builder.quantity;
        this.discount = builder.discount;
    }

    public String getDescription() {
        return description;
    }

    public double getDiscount() {
        return discount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "description='" + description + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", discount=" + discount +
                '}';
    }

    public static class ProductBuilder {
        int id;
        String name;
        String description;
        double price;
        int quantity;
        double discount;

        public ProductBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public ProductBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public ProductBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public ProductBuilder setPrice(double price) {
            this.price = price;
            return this;
        }

        public ProductBuilder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public ProductBuilder setDiscount(double discount) {
            this.discount = discount;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }
}
