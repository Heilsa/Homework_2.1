package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

public class App {

    public static void main(String[] args) {

        // Создаем продукты
        Product milk = new Product("Молоко", 50);
        Product bread = new Product("Хлеб", 30);
        Product butter = new Product("Масло", 100);
        Product cheese = new Product("Сыр", 150);
        Product juice = new Product("Сок", 80);
        Product apple = new Product("Яблоко", 20);

        // Создаем корзину
        ProductBasket basket = new ProductBasket();

        // Добавление продукта в корзину
        basket.addProduct(milk);

        // Заполняем корзину до предела
        basket.addProduct(bread);
        basket.addProduct(butter);
        basket.addProduct(cheese);
        basket.addProduct(juice);

        // Попытка добавить еще один продукт
        basket.addProduct(apple);

        // Печать содержимого корзины
        System.out.println("Содержимое корзины:");
        basket.printContents();

        // Получение стоимости корзины
        System.out.println("Общая стоимость: " + basket.getTotalPrice());

        // Проверка наличия товара в корзине
        System.out.println("Есть ли в корзине 'Молоко'? " + basket.containsProduct("Молоко"));

        System.out.println("Есть ли в корзине 'Яблоко'? " + basket.containsProduct("Яблоко"));

        // Очистка корзины
        basket.clear();

        // Печать содержимого после очистки
        System.out.println("После очистки:");
        basket.printContents();

        // Получение стоимости пустой корзины
        System.out.println("Общая стоимость после очистки: " + basket.getTotalPrice());

        // Проверка наличия товара в пустой корзине
        System.out.println("Есть ли в пустой корзине 'Молоко'? " + basket.containsProduct("Молоко"));
    }
}