package org.skypro.skyshop.app;

import org.skypro.skyshop.search.Searchable;

import java.util.Objects;

public class Article implements Searchable {
    private String name;

    public Article(String name, String s) {
        this.name = name;
    }

    @Override
    public String getSearchTerm() {
        return "";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return "";
    }

    // equals и hashCode по полю name
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Article)) return false;
        Article article = (Article) o;
        return name.equals(article.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}