package foodWebsiteProject.dataAccess.util;


import foodWebsiteProject.dataAccess.entity.UserEntity;
import foodWebsiteProject.model.User;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {
    Mapper mapper = new DozerBeanMapper();
    public UserEntity userModelToUserEntity(User user){
        return mapper.map(user, UserEntity.class);
    }

    public User userEntityToUserModel(UserEntity userEntity){
        return mapper.map(userEntity, User.class);
    }

}
