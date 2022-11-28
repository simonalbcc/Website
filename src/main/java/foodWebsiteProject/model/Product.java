package foodWebsiteProject.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class Product {
    private Integer id;
    private String name;
    private String size;
    private Float price_catalog;
    private String description;
    private Integer category;

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

    public Float getPrice_catalog() {
        return price_catalog;
    }

    public String getDescription() {
        return description;
    }

    public Integer getCategory() {
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

    public void setPrice_catalog(Float price_catalog) {
        this.price_catalog = price_catalog;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }
    //endregion

    public Product(){}
}
