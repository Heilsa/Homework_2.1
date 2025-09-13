package org.skypro.skyshop.product;

import org.skypro.skyshop.search.Searchable;

public abstract class Product implements Searchable {
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Тип продукта — можем определить в каждом классе отдельно
    public abstract String getType();

    // Для поиска по названию
    @Override
    public String getSearchTerm() {
        return name;
    }
}