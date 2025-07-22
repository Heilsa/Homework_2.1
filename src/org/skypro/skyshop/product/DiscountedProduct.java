package org.skypro.skyshop.product;

import org.skypro.skyshop.product.Product;

public class DiscountedProduct extends Product {
    private double basePrice;
    private int discountPercent; // от 0 до 100 включительно

    public DiscountedProduct(String name, double basePrice, int discountPercent) {
        super(name);
        if (basePrice <= 0) {
            throw new IllegalArgumentException("Базовая цена должна быть больше 0");
        }
        if (discountPercent < 0 || discountPercent > 100) {
            throw new IllegalArgumentException("Процент скидки должен быть в диапазоне от 0 до 100");
        }
        this.basePrice = basePrice;
        this.discountPercent = discountPercent;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
}