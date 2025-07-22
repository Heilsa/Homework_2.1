public class MySearchable implements Searchable {
    private String searchTerm;

    public MySearchable(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    @Override
    public String getSearchTerm() {
        return searchTerm;
    }
}