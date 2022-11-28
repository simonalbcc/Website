package foodWebsiteProject.dataAccess.dao;

import foodWebsiteProject.model.Product;

import java.util.ArrayList;

public interface ProductDataAccess  {
    public ArrayList<Product> getAllProductsByCategoryId(Integer categoryId);
}
