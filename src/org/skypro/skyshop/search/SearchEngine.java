package org.skypro.skyshop.search;

import java.util.Arrays;

public class SearchEngine {

    private Searchable[] items;
    private int size; // текущий счетчик добавленных элементов

    public SearchEngine(int capacity) {
        this.items = new Searchable[capacity];
        this.size = 0;
    }

    public void add(Searchable item) {
        if (size < items.length) {
            items[size] = item;
            size++;
        } else {
            System.out.println("Массив полон, добавление невозможно");
        }
    }

    public Searchable[] search(String query) {
        Searchable[] results = new Searchable[5];
        int count = 0;

        for (int i = 0; i < size; i++) {
            String term = items[i].getSearchTerm();
            if (term != null && term.contains(query)) {
                results[count] = items[i];
                count++;
                if (count == 5) break;
            }
        }
        return results;
    }
}