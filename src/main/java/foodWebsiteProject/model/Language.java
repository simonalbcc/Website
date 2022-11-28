package foodWebsiteProject.model;

public class Language {
    private Integer translation;
    private String name;

    public Language() {}

    public Integer getTranslation() {
        return translation;
    }
    public String getName() {
        return name;
    }

    public void setTranslation(Integer translation) {
        this.translation = translation;
    }
    public void setName(String name) {
        this.name = name;
    }
}
