package foodWebsiteProject.dataAccess.dao;

import foodWebsiteProject.model.Product;

import java.util.List;

public interface ProductDataAccess  {

    List<Product> getAllFromCategory(Integer id_category);

}
