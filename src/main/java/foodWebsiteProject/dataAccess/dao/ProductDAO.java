package foodWebsiteProject.dataAccess.dao;

import foodWebsiteProject.dataAccess.entity.ProductEntity;
import foodWebsiteProject.dataAccess.repository.ProductRepository;
import foodWebsiteProject.dataAccess.util.ProviderConverter;
import foodWebsiteProject.model.Product;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service
public class ProductDAO implements ProductDataAccess{
    private ProductRepository productRepository;
    private ProviderConverter productConverter;

    public ProductDAO(ProductRepository productRepository, ProviderConverter productConverter) {
        this.productRepository = productRepository;
        this.productConverter = productConverter;
    }

    public ArrayList<Product> getAllProductsByCategoryId(Integer categoryId) {
        List<ProductEntity> productsEntites = productRepository.findProductEntitiesByCategoryEntityId(categoryId);
        ArrayList<Product> products = new ArrayList<>();
        productsEntites.forEach(p -> products.add(productConverter.productEntityToProductModel(p)));
        return products;
    }
}
