package foodWebsiteProject.dataAccess.util;

import foodWebsiteProject.dataAccess.entity.CategoryEntity;
import foodWebsiteProject.dataAccess.entity.ProductEntity;
import foodWebsiteProject.dataAccess.entity.UserEntity;
import foodWebsiteProject.model.Category;
import foodWebsiteProject.model.Product;
import foodWebsiteProject.model.User;
import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Component;

@Component
public class ProviderConverter {

    DozerBeanMapper mapper;

    public ProviderConverter() {
        mapper = new DozerBeanMapper();
    }

    public UserEntity userModelToUserEntity(User user){
        return mapper.map(user, UserEntity.class);
    }

    public User userEntityToUserModel(UserEntity userEntity){
        return mapper.map(userEntity, User.class);
    }


    public CategoryEntity categoryModelToCategoryEntity(Category category){
        return mapper.map(category, CategoryEntity.class);
    }
    public Category categoryEntityToCategoryModel(CategoryEntity categoryEntity){
        return mapper.map(categoryEntity, Category.class);
    }

    public ProductEntity productModelToProductEntity(Product product){
        return mapper.map(product, ProductEntity.class);
    }
    public Product productEntityToProductModel(ProductEntity productEntity){
        Product product = new Product();
        product.setCategory(productEntity.getCategory().getId()); // pb
        product.setId(productEntity.getId());
        product.setDescription(productEntity.getDescription());
        product.setName(productEntity.getName());
        product.setSize(productEntity.getSize());
        product.setPriceCatalog(productEntity.getPriceCatalog());
        return product;
    }
}
