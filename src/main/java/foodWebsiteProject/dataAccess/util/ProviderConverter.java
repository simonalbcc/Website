package foodWebsiteProject.dataAccess.util;

import foodWebsiteProject.dataAccess.entity.CategoryEntity;
import foodWebsiteProject.dataAccess.entity.ProductEntity;
import foodWebsiteProject.dataAccess.entity.TranslationEntity;
import foodWebsiteProject.dataAccess.entity.UserEntity;
import foodWebsiteProject.model.Category;
import foodWebsiteProject.model.Product;
import foodWebsiteProject.model.Translation;
import foodWebsiteProject.model.User;
import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Component;

import javax.swing.*;

@Component
public class ProviderConverter {

    DozerBeanMapper mapper;

    public ProviderConverter() {
        mapper = new DozerBeanMapper();
    }

    public UserEntity userModelToUserEntity(User user){

        UserEntity userEntity  = mapper.map(user, UserEntity.class);
        userEntity.setNumberPhone(user.getNumberPhone());
        userEntity.setNonExpired(user.getAccountNonExpired());
        userEntity.setNonLocked(user.getAccountNonLocked());
        userEntity.setCredentialsNonExpired(user.getCredentialsNonExpired());
        userEntity.setEnabled(user.getEnabled());
        userEntity.setAuthorities("user");
        return userEntity;
    }

    public User userEntityToUserModel(UserEntity userEntity){
        if(userEntity == null){
            return null;
        }
        User user = mapper.map(userEntity, User.class);
        user.setAccountNonExpired(userEntity.getNonExpired());
        user.setAccountNonLocked(userEntity.getNonLocked());
        user.setCredentialsNonExpired(userEntity.getCredentialsNonExpired());
        user.setEnabled(userEntity.getEnabled());
        user.setAuthorities(userEntity.getAuthorities());
        return user;
    }

    public Category categoryEntityToCategoryModel(CategoryEntity categoryEntity){
        return mapper.map(categoryEntity, Category.class);
    }

    public Translation translationEntityToTranslationModel(TranslationEntity translationEntity){
        return mapper.map(translationEntity, Translation.class);
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
