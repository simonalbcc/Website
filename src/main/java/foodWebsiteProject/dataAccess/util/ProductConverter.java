package foodWebsiteProject.dataAccess.util;

import foodWebsiteProject.dataAccess.entity.ProductEntity;
import foodWebsiteProject.model.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductConverter {
    public ProductEntity productModelToProductEntity(Product product){
        ProductEntity productEntity = new ProductEntity();
        productEntity.setCategory(product.getCategory());
        productEntity.setId(product.getId());
        productEntity.setDescription(product.getDescription());
        productEntity.setName(product.getName());
        productEntity.setSize(product.getSize());
        productEntity.setPrice_catalog(product.getPrice_catalog());
        return productEntity;
    }
    public Product productEntityToProductModel(ProductEntity productEntity){
        Product product = new Product();
        product.setCategory(productEntity.getCategory());
        product.setId(productEntity.getId());
        product.setDescription(productEntity.getDescription());
        product.setName(productEntity.getName());
        product.setSize(productEntity.getSize());
        product.setPrice_catalog(productEntity.getPrice_catalog());
        return product;
    }
}
