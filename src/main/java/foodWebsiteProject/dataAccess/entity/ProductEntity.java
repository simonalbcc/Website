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
    private Double priceCatalog;

    @Column(name = "description")
    private String description;

    @JoinColumn(name="category", referencedColumnName = "id")
    @ManyToOne
    private CategoryEntity category;

    public ProductEntity() {}

    public ProductEntity(Integer id){
        this.id = id;
    }

    public ProductEntity(Integer id, String name, String size, Double priceCatalog, String description, CategoryEntity category) {
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

    public Double getPriceCatalog() {
        return priceCatalog;
    }

    public String getDescription() {
        return description;
    }

    public CategoryEntity getCategory() {
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

    public void setPriceCatalog(Double priceCatalog) {
        this.priceCatalog = priceCatalog;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(CategoryEntity category) {
        this.category = category;
    }
    //endregion
}
