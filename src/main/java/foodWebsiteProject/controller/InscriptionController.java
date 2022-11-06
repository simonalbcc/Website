package foodWebsiteProject.controller;

import foodWebsiteProject.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/inscription")
public class InscriptionController {

    @RequestMapping (method = RequestMethod.GET)
    public String home(Model model){
        model.addAttribute("user", new User());
        return "integrated:userInscription";
    }

    @RequestMapping(value = "/send", method = RequestMethod.POST)
    public String getFormData(@ModelAttribute(value="user") User user){
        return "integrated:welcome";
    }
}
