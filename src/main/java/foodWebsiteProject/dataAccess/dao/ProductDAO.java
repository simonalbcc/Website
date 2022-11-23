package foodWebsiteProject.dataAccess.dao;

import foodWebsiteProject.dataAccess.entity.ProductEntity;
import foodWebsiteProject.dataAccess.repository.ProductRepository;
import foodWebsiteProject.dataAccess.util.ProductConverter;
import foodWebsiteProject.model.Product;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service
public class ProductDAO implements ProductDataAccess{
    private ProductRepository productRepository;
    private ProductConverter productConverter;

    public ProductDAO(ProductRepository productRepository, ProductConverter productConverter) {
        this.productRepository = productRepository;
        this.productConverter = productConverter;
    }

    @Override
    public List<Product> getAllFromCategory(Integer id_category) {
        List<ProductEntity> productsEntites = productRepository.findAll();
        List<Product> products = new ArrayList<>();
        productsEntites.forEach(p -> products.add(productConverter.productEntityToProductModel(p)));
        return products;
    }
}
