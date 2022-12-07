package foodWebsiteProject.dataAccess.util;

import foodWebsiteProject.dataAccess.entity.*;
import foodWebsiteProject.model.*;
import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Component;

import javax.sound.sampled.Line;
import java.util.Optional;

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
        User user = mapper.map(userEntity, User.class);
        user.setAccountNonExpired(userEntity.getNonExpired());
        user.setAccountNonLocked(userEntity.getNonLocked());
        user.setCredentialsNonExpired(userEntity.getCredentialsNonExpired());
        user.setEnabled(userEntity.getEnabled());
        user.setAuthorities(userEntity.getAuthorities());
        return user;
    }

    public Order orderEntityToOrderModel(OrderEntity orderEntity){
        return mapper.map(orderEntity, Order.class);
    }
    public OrderEntity orderModelToOrderEntity(Order order){
        return mapper.map(order, OrderEntity.class);
    }


    public LineOrder lineOrderEntityToLineOrderModel(LineOrderEntity lineOrderEntity){
        return mapper.map(lineOrderEntity, LineOrder.class);
    }
    public LineOrderEntity lineOrderModelToLineOrderEntity(LineOrder lineOrderModel){
        return mapper.map(lineOrderModel, LineOrderEntity.class);
    }

    public Category categoryEntityToCategoryModel(CategoryEntity categoryEntity){
        return mapper.map(categoryEntity, Category.class);
    }

    public Translation translationEntityToTranslationModel(TranslationEntity translationEntity){

        return mapper.map(translationEntity, Translation.class);
    }

    public Product productEntityToProductModel(ProductEntity productEntity){
        return mapper.map(productEntity, Product.class);
    }
}
