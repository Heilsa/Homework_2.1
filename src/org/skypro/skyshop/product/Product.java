package org.skypro.skyshop.product;

import org.skypro.skyshop.search.Searchable;

public class Product implements Searchable {
    private String name;
    private String description;

    public Product(String name) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSearchTerm() {
        return description;
    }

    @Override
    public String getType() {
        return "";
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', description='" + description + "'}";
    }

    public boolean isSpecial() {
        return false;
    }
}