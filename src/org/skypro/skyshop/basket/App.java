package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.basket.SimpleProduct;
import org.skypro.skyshop.basket.FixPriceProduct;
import org.skypro.skyshop.basket.DiscountedProduct;

import java.util.ArrayList;
import java.util.List;

class Main {
    private List<Product> basket; // поле класса

    public Main() {
        this.basket = new ArrayList<>();
    }

    public static void main(String[] args) {
        Main app = new Main();

        // добавляем товары в корзину через поле экземпляра
        app.basket.add(new SimpleProduct("Яблоко", 300));
        app.basket.add(new FixPriceProduct("Молоко")); // фиксированная цена
        app.basket.add(new DiscountedProduct("Киви", 200, 25)); // скидка 25%
        app.basket.add(new FixPriceProduct("Апельсин")); // еще один фиксированный товар
        app.basket.add(new DiscountedProduct("Гранат", 50, 15)); // скидка 15%


        app.printBasket();
    }

    public void printBasket() {
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