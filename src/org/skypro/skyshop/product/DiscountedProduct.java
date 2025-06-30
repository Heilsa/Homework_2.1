package org.skypro.skyshop.product;

public class DiscountedProduct implements Product {
    private String name;
    private int originalPrice;
    private int discountPercent;

    public DiscountedProduct(String name, int originalPrice, int discountPercent) {
        this.name = name;
        this.originalPrice = originalPrice;
        this.discountPercent = discountPercent;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return originalPrice - (originalPrice * discountPercent / 100);
    }

    @Override
    public boolean isSpecial() {
        return true; // считаем специальным товаром
    }

    @Override
    public String toString() {
        return "Товар со скидкой: " + name + ", Оригинальная цена: " + originalPrice +
                ", Скидка: " + discountPercent + "%, Итоговая цена: " + getPrice();
    }
}