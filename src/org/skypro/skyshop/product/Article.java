package org.skypro.skyshop.product;

import org.skypro.skyshop.search.Searchable;

public final class Article implements Searchable {
    private String  stateName;
    private String  stateContent;

    public Article(String stateName, String stateContent) {
        this.stateName = stateName;
        this.stateContent = stateContent;
    }

    public String getStateName() {
        return stateName;
    }

    public String getStateContent() {
        return stateContent;
    }

    @Override
    public String toString() {
        return stateName + "\n" + stateContent;
    }

    @Override
    public String getSearchTerm() {
        // Можно объединить название и содержание для поиска
        return toString();
    }

    @Override
    public String getType() {
        return "ARTICLE";
    }

    @Override
    public String getName() {
        return this.stateName;
    }
}