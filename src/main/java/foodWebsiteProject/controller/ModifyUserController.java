package foodWebsiteProject.controller;


import foodWebsiteProject.dataAccess.dao.UserDAO;
import foodWebsiteProject.dataAccess.dao.UserDataAccess;
import foodWebsiteProject.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping(value ="/editProfile")
public class ModifyUserController {

    private UserDataAccess userDAO;

    @Autowired
    public ModifyUserController(UserDAO userDAO){
        this.userDAO = userDAO;
    }

    @RequestMapping (method = RequestMethod.GET)
    public String getModifyPage(Model model){

        model.addAttribute("user",(User) SecurityContextHolder.getContext().getAuthentication().getPrincipal());
        model.addAttribute("tabTitle", "Edit profil");
        model.addAttribute("cssName", "form");

        return "integrated:formModify";
    }

    @RequestMapping (value="/send",method = RequestMethod.POST)
    public String postModifyForm(@Valid @ModelAttribute(value="user") User user, final BindingResult errors){
        User actualUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        if(!user.getPassword().equals(actualUser.getPassword())){
            if(!user.getPassword().equals(user.getConfirmedPassword())){
                errors.rejectValue("confirmedPassword", "confirmedPasswordNotMatch");
            }else{
                BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
                String password = bCryptPasswordEncoder.encode(user.getPassword());
                actualUser.setPassword(password);
            }
        }
        if(!errors.hasErrors()) {
            actualUser.setLastName(user.getLastName());
            actualUser.setFirstName(user.getFirstName());
            actualUser.setNumberPhone(user.getNumberPhone().equals("") ? null : user.getNumberPhone());
            actualUser.setAddress(user.getAddress());
            userDAO.save(actualUser);

            return "redirect:/welcome";
        }else{
            return "integrated:formModify";
        }

    }


}
