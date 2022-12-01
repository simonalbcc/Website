package foodWebsiteProject.model;

public class Translation {

    private Integer id;
    private String categoryName;

    public Translation() {}

    public String getCategoryName() {
        return categoryName;
    }
    public Integer getId() {
        return id;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    public void setId(Integer id) {
        this.id = id;
    }
}
