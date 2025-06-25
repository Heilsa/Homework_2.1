package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.ArrayList;
import java.util.List;

class Main {
    private List<Product> basket;

    // Конструктор для инициализации корзины
    public Main(List<Product> basket) {
        this.basket = basket;
    }

    // Нестатический метод для печати корзины
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

    public static void main(String[] args) {
        // Создаем список товаров (корзину)
        List<Product> basket = new ArrayList<>();
        basket.add(new SimpleProduct("Яблоко", 300));
        basket.add(new FixPriceProduct("Молоко")); // фиксированная цена
        basket.add(new DiscountedProduct("Киви", 200, 25)); // скидка 25%
        basket.add(new FixPriceProduct("Апельсин")); // еще один фиксированный товар
        basket.add(new DiscountedProduct("Гранат", 50, 15)); // скидка 15%

        // Создаем объект Main с корзиной
        Main shoppingCart = new Main(basket);

        // Вызываем метод для печати корзины
        shoppingCart.printBasket();
    }
}