package org.skypro.skyshop.basket;

import org.skypro.skyshop.basket.DiscountedProduct;
import org.skypro.skyshop.basket.FixPriceProduct;
import org.skypro.skyshop.basket.SimpleProduct;
import org.skypro.skyshop.product.Product;

import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        // Создаем список товаров (корзину)
        List<Product> basket = new ArrayList<>();

        // Добавляем товары разных типов
        basket.add(new SimpleProduct("Яблоко", 300));
        basket.add(new FixPriceProduct("Молоко")); // фиксированная цена
        basket.add(new DiscountedProduct("Киви", 200, 25)); // скидка 25%
        basket.add(new FixPriceProduct("Апельсин")); // еще один фиксированный товар
        basket.add(new DiscountedProduct("Гранат", 50, 15)); // скидка 15%

        // Выводим содержимое корзины
        printBasket(basket);
    }
    public static void printBasket(List<Product> basket) {
        int totalCost = 0;
        int specialCount = 0;

        for (Product product : basket) {
            System.out.println(product.toString());
            totalCost += product.getPrice();
            if (product.isSpecial()) {
                specialCount++;
            }
        }
        System.out.println("Итого: " + totalCost);
        System.out.println("Специальных товаров: " + specialCount);
    }
}