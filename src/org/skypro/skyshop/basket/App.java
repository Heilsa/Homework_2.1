package org.skypro.skyshop.basket;

import org.skypro.skyshop.basket.DiscountedProduct;
import org.skypro.skyshop.basket.FixPriceProduct;
import org.skypro.skyshop.basket.SimpleProduct;
import org.skypro.skyshop.product.Product;

import java.util.ArrayList;
import java.util.List;

// Класс корзины
class Basket {
    private List<Product> products;

    public Basket() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    // Нестатический метод для печати содержимого корзины
    public void printBasket() {
        int totalCost = 0;
        int specialCount = 0;

        for (Product product : products) {
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

public class App {
    public static void main(String[] args) {
        // Создаем корзину
        Basket basket = new Basket();

        // Добавляем товары разных типов
        basket.addProduct(new SimpleProduct("Яблоко", 300));
        basket.addProduct(new FixPriceProduct("Молоко")); // фиксированная цена
        basket.addProduct(new DiscountedProduct("Киви", 200, 25)); // скидка 25%
        basket.addProduct(new FixPriceProduct("Апельсин")); // еще один фиксированный товар
        basket.addProduct(new DiscountedProduct("Гранат", 50, 15)); // скидка 15%

        // Выводим содержимое корзины
        basket.printBasket();
    }
}