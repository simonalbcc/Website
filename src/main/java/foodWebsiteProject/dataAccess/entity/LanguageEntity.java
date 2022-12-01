package foodWebsiteProject.dataAccess.entity;

import javax.persistence.*;

@Entity
@Table(name="language")
public class LanguageEntity {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    public LanguageEntity() {}

    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
}