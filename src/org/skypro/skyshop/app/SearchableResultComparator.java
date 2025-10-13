package org.skypro.skyshop.app;

import org.skypro.skyshop.search.Searchable;
import java.util.Comparator;

public class SearchableResultComparator implements Comparator<Searchable> {
    @Override
    public int compare(Searchable o1, Searchable o2) {
        int lenCompare = Integer.compare(o2.getName().length(), o1.getName().length());
        if (lenCompare != 0) {
            return lenCompare;
        }
        return o1.getName().compareTo(o2.getName());
    }
}