package foodWebsiteProject.dataAccess.util;

import foodWebsiteProject.dataAccess.entity.ProductEntity;
import foodWebsiteProject.model.Product;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.stereotype.Component;

@Component
public class ProductConverter {
    private Mapper mapper = new DozerBeanMapper();
    public ProductEntity productModelToProductEntity(Product product){
        return mapper.map(product, ProductEntity.class);
    }
    public Product productEntityToProductModel(ProductEntity productEntity){
        return mapper.map(productEntity, Product.class);
    }
}
