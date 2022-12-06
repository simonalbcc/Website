package foodWebsiteProject.dataAccess.dao;

import foodWebsiteProject.model.Translation;

import java.util.ArrayList;

public interface TranslationDataAccess {
    ArrayList<Translation> getAllCategoriesWithAnId(Integer id);
    ArrayList<Translation> getAllCategories();
}
