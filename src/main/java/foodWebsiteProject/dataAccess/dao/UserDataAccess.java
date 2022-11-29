package foodWebsiteProject.dataAccess.dao;

import foodWebsiteProject.model.User;

public interface UserDataAccess {

    User save(User user);

    Boolean isAlreadyCreated(User user);

    User getUserByEmailAddress(String emailAddress);
}
