package foodWebsiteProject.controller;

import foodWebsiteProject.dataAccess.dao.UserDAO;
import foodWebsiteProject.dataAccess.dao.UserDataAccess;
import foodWebsiteProject.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@Controller
@RequestMapping(value="/inscription")
public class InscriptionController {

    private UserDataAccess userDAO;

    @Autowired
    public InscriptionController(UserDAO userDAO){
        this.userDAO = userDAO;
    }

    @RequestMapping (method = RequestMethod.GET)
    public String getInscriptionPage(Model model){

        model.addAttribute("user", new User());
        model.addAttribute("tabTitle", "Sign in");
        model.addAttribute("cssName", "form");

        return "integrated:formInscription";
    }

    @RequestMapping(value = "/send", method = RequestMethod.POST)
    public String getFormData(@Valid @ModelAttribute(value="user") User user, final BindingResult errors){

        if(userDAO.isAlreadyCreated(user)) {
            errors.rejectValue("emailAddress","userEmail");
        }
        if(!user.getPassword().equals(user.getConfirmedPassword())){
            errors.rejectValue("confirmedPassword", "confirmedPasswordNotMatch");
        }
        if(!errors.hasErrors()){
            user.setFidelityCard(0);
            if(user.getNumberPhone().equals("")){
                user.setNumberPhone(null);
            }
            user.setCredentialsNonExpired(true);
            user.setAccountNonLocked(true);
            user.setAccountNonExpired(true);
            user.setEnabled(true);
            user.setAuthorities("USER");

            BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
            String password = bCryptPasswordEncoder.encode(user.getPassword());
            user.setPassword(password);
            userDAO.save(user);
            return "redirect:/welcome";
        }

        return "integrated:formInscription";
    }
}
