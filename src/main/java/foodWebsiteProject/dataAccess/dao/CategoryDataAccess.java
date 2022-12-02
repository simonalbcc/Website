package foodWebsiteProject.dataAccess.dao;

import foodWebsiteProject.dataAccess.entity.CategoryEntity;
import foodWebsiteProject.model.Category;

import java.util.ArrayList;

public interface CategoryDataAccess {
    ArrayList<Category> findAllCategories();
}
