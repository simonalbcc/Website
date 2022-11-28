package foodWebsiteProject.dataAccess.entity;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class ProductEntity {
    @Id
    @Column(name="id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "size")
    private String size;

    @Column(name="price_catalog")
    private Float price_catalog;

    @Column(name = "description")
    private String description;

    @Column(name="category")
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
}