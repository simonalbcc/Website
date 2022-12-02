package foodWebsiteProject.model;

public class Translation {

    private Integer id;
    private String categoryName;
    private Category category;
    private Language language;

    public Translation() {}

    public String getCategoryName() {
        return categoryName;
    }
    public Integer getId() {
        return id;
    }
    public Category getCategory() {
        return category;
    }
    public Language getLanguage() {
        return language;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public void setCategory(Category category) {
        this.category = category;
    }
    public void setLanguage(Language language) {
        this.language = language;
    }
}
