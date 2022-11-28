package foodWebsiteProject.dataAccess.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="language")
public class LanguageEntity {
    @Id
    @Column(name = "name")
    private String name;

    @Column(name="translation")
    private Integer translation;
}