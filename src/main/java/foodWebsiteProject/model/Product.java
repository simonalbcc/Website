package foodWebsiteProject.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class Product {
    private Integer id;
    private String name;
    private String size;
    private Float priceCatalog;
    private String description;
    private Category category;

    public Product(){}
    public Product(Integer id, String name, String size, Float priceCatalog, String description, Category category) {
        this.id = id;
        this.name = name;
        this.size = size;
        this.priceCatalog = priceCatalog;
        this.description = description;
        this.category = category;
    }

    //region getter
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public Float getPriceCatalog() {
        return priceCatalog;
    }

    public String getDescription() {
        return description;
    }

    public Category getCategory() {
        return category;
    }
    //endregion

    //region setter
    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setPriceCatalog(Float priceCatalog) {
        this.priceCatalog = priceCatalog;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
    //endregion

}
