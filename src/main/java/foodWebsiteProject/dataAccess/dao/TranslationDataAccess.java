package foodWebsiteProject.dataAccess.dao;

import foodWebsiteProject.model.Translation;

import java.util.ArrayList;

public interface TranslationDataAccess {
    ArrayList<Translation> getAllCategories(Integer id);
    ArrayList<Translation> getAllCategories();
}
