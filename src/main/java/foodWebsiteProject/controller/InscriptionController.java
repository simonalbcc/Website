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

@Controller
@RequestMapping(value="/inscription")
public class InscriptionController {

    private UserDataAccess userDAO;

    @Autowired
    public InscriptionController(UserDAO userDAO){
        this.userDAO = userDAO;
    }

    @RequestMapping (method = RequestMethod.GET)
    public String home(Model model){
        model.addAttribute("user", new User());
        return "integrated:userInscription";
    }

    @RequestMapping(value = "/send", method = RequestMethod.POST)
    public String getFormData(@Valid @ModelAttribute(value="user") User user, final BindingResult errors){
        if(!errors.hasErrors()){
            user.setFidelityCard(0);
            userDAO.save(user);
            return "redirect:/welcome";
        }
        return "integrated:userInscription";
    }
}
