package foodWebsiteProject.dataAccess.dao;

import foodWebsiteProject.dataAccess.entity.UserEntity;
import foodWebsiteProject.dataAccess.repository.UserRepository;
import foodWebsiteProject.dataAccess.util.ProviderConverter;
import foodWebsiteProject.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;


@Service
public class UserDAO implements UserDataAccess{

    private UserRepository userRepository;
    private ProviderConverter userConverter;

    @Autowired
    public UserDAO(UserRepository userRepository, ProviderConverter userConverter){
        this.userConverter = userConverter;
        this.userRepository = userRepository;
    }
    @Transactional
    public User save(User user){
        UserEntity userEntity = userConverter.userModelToUserEntity(user);
        userEntity = userRepository.save(userEntity);
        return userConverter.userEntityToUserModel(userEntity);
    }

    public Boolean isAlreadyCreated(User user){
        return userRepository.existsById(user.getEmailAddress());
    }

    public User getUserByEmailAddress(String emailAddress){
        UserEntity userEntity = userRepository.findUserEntityByEmailAddress(emailAddress);
        if(userEntity != null){
            return userConverter.userEntityToUserModel(userEntity);
        }
        return null;
    }
}
