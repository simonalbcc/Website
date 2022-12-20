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
    private Float priceCatalog;

    @Column(name = "description")
    private String description;

    @JoinColumn(name="category", referencedColumnName = "id")
    @ManyToOne
    private CategoryEntity category;

    public ProductEntity() {}

    public ProductEntity(Integer id){
        this.id = id;
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

    public void setPriceCatalog(Float priceCatalog) {
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
