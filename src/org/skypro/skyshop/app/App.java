package org.skypro.skyshop.app;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.*;
import org.skypro.skyshop.search.SearchEngine;
import org.skypro.skyshop.search.Searchable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main {

    public static void main(String[] args) {

        List<Product> basketItems = new ArrayList<>();
        basketItems.add(new SimpleProduct("Яблоко", 300, false));
        basketItems.add(new FixPriceProduct("Молоко")); // фиксированная цена
        basketItems.add(new DiscountedProduct("Киви", 200, 25)); // скидка 25%
        basketItems.add(new FixPriceProduct("Апельсин")); // еще один фиксированный товар
        basketItems.add(new DiscountedProduct("Гранат", 50, 15)); // скидка 15%


        // Создаем объект корзины и выводим содержимое
        ProductBasket basket = new ProductBasket(basketItems);
        basket.printBasket();

        // Создаем движок поиска с вместимостью 15 элементов
        SearchEngine engine = new SearchEngine(15);

        // Добавляем товары
        Product product1 = new SimpleProduct("Honor", 3000, false);
        Product product2 = new SimpleProduct("HyperBeast", 5000, true);
        Product product3 = new SimpleProduct("MR710", 1500, true);

        engine.add((Searchable) product1);
        engine.add((Searchable) product2);
        engine.add((Searchable) product3);

        // Добавляем статьи
        Article article1 = new Article("Телефоны", "Обзор лучших телефонов 2025");
        Article article2 = new Article("ПК", "Лучшие ПК для работы и развлечений");
        Article article3 = new Article("Периферия", "Обзор лучшей периферии ");

        engine.add(article1);
        engine.add(article2);
        engine.add(article3);

        // Выполняем поиск по разным запросам и выводим результаты

        String[] queries = {"Телефоны", "лучшие", "периферия", "HyperBeast", "Обзор"};

        for (String q : queries) {
            System.out.println("Результаты поиска по запросу: \"" + q + "\":");
            Searchable[] res = engine.search(q);
            System.out.println(Arrays.toString(res));
            System.out.println();
        }
    }
}