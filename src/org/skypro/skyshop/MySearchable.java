package org.skypro.skyshop;

import org.skypro.skyshop.search.Searchable;

public interface MySearchable {
    public class MySearchables implements Searchable {
        private String searchTerm;

        public MySearchables(String searchTerm) {
            this.searchTerm = searchTerm;
        }

        @Override
        public String getSearchTerm() {
            return searchTerm;
        }

        @Override
        public String getName() {
            return "";
        }

        @Override
        public String getType() {
            return "";
        }
    }
}
