package org.skypro.skyshop.product;

public abstract class Product {
    protected String name;

    public Product(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Название продукта не может быть null, пустым или состоять только из пробелов");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }
}