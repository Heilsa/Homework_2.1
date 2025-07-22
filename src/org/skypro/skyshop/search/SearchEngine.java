package org.skypro.skyshop.search;

import org.skypro.skyshop.BestResultNotFound;
import org.skypro.skyshop.search.Searchable;

import java.util.List;

public class SearchEngine {
    private List<Searchable> items;

    public SearchEngine(List<Searchable> items) {
        this.items = items;
    }

    public Searchable findBestMatch(String search) throws BestResultNotFound {
        if (items == null || items.isEmpty()) {
            throw new BestResultNotFound("Нет элементов для поиска по запросу: " + search);
        }
        if (search == null || search.isBlank()) {
            throw new BestResultNotFound("Пустой поисковый запрос");
        }

        Searchable bestMatch = null;
        int maxCount = -1;

        for (Searchable item : items) {
            String term = item.getSearchTerm();
            int count = countOccurrences(term, search);
            if (count > maxCount) {
                maxCount = count;
                bestMatch = item;
            }
        }

        if (bestMatch == null || maxCount == 0) {
            throw new BestResultNotFound("Поисковый запрос '" + search + "' не дал подходящих результатов.");
        }

        return bestMatch;
    }

    private int countOccurrences(String str, String sub) {
        int count = 0;
        int index = 0;
        int subLength = sub.length();

        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index += subLength;
        }
        return count;
    }
}