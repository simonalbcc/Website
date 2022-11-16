package foodWebsiteProject.dataAccess.util;


import foodWebsiteProject.dataAccess.entity.UserEntity;
import foodWebsiteProject.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {

    public UserEntity userModelToUserEntity(User user){
        UserEntity userEntity = new UserEntity();
        userEntity.setAddress(user.getAddress());
        userEntity.setEmailAddress(user.getEmailAddress());
        userEntity.setLastName(user.getLastName());
        userEntity.setFirstName(user.getFirstName());
        userEntity.setFidelityCard(user.getFidelityCard());
        userEntity.setPassword(user.getPassword());
        userEntity.setNumberPhone(user.getNumberPhone());
        return userEntity;
    }

    public User userEntityToUserModel(UserEntity userEntity){
        User user = new User();
        user.setAddress(userEntity.getAddress());
        user.setEmailAddress(userEntity.getEmailAddress());
        user.setLastName(userEntity.getLastName());
        user.setFirstName(userEntity.getFirstName());
        user.setFidelityCard(userEntity.getFidelityCard());
        user.setPassword(userEntity.getPassword());
        user.setNumberPhone(userEntity.getNumberPhone());
        return user;
    }

}
