package foodWebsiteProject.dataAccess.entity;

import javax.persistence.*;

@Entity
@Table(name="translation")
public class TranslationEntity {
    @Id
    @Column(name="id")
    private Integer id;

    @Column(name="category_name")
    private String categoryName;

    @JoinColumn(name = "category", referencedColumnName = "id")
    @ManyToOne
    private CategoryEntity category;

    @JoinColumn(name = "language", referencedColumnName = "id")
    @ManyToOne
    private LanguageEntity language;

    public TranslationEntity() {}

    public Integer getId() {
        return id;
    }
    public String getCategoryName() {
        return categoryName;
    }
    public CategoryEntity getCategory() {
        return category;
    }
    public LanguageEntity getLanguage() {
        return language;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    public void setCategory(CategoryEntity category) {
        this.category = category;
    }
    public void setLanguage(LanguageEntity language) {
        this.language = language;
    }
}
