package foodWebsiteProject.dataAccess.dao;

import foodWebsiteProject.dataAccess.entity.UserEntity;
import foodWebsiteProject.dataAccess.repository.UserRepository;
import foodWebsiteProject.dataAccess.util.UserConverter;
import foodWebsiteProject.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@Service
public class UserDAO implements UserDataAccess{

    private UserRepository userRepository;
    private UserConverter userConverter;

    @Autowired
    public UserDAO(UserRepository userRepository, UserConverter userConverter){
        this.userConverter = userConverter;
        this.userRepository = userRepository;
    }

    public User save(User user){
        UserEntity userEntity = userConverter.userModelToUserEntity(user);
        userEntity = userRepository.save(userEntity);
        return userConverter.userEntityToUserModel(userEntity);
    }

    public Boolean isAlreadyCreated(User user){
        return userRepository.existsById(user.getEmailAddress());
    }
}
