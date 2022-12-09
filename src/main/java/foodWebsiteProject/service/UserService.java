package foodWebsiteProject.service;

import foodWebsiteProject.dataAccess.dao.UserDAO;
import foodWebsiteProject.dataAccess.dao.UserDataAccess;
import foodWebsiteProject.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {
    private UserDataAccess userDAO;

    @Autowired
    public UserService(UserDAO userDAO){
        this.userDAO = userDAO;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
        User user = userDAO.getUserByEmailAddress(username);
        if(user != null){
            return user;
        }
        throw new UsernameNotFoundException("User not found");
    }
}
