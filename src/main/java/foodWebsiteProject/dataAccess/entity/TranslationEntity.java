package foodWebsiteProject.dataAccess.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="translation")
public class TranslationEntity {
    @Id
    @Column(name="id")
    private Integer id; 
    
    @Column(name="category")
    private Integer categoryId;

    @Column(name="category_name")
    private String categoryName;



}
