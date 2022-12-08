package foodWebsiteProject.controller;

import foodWebsiteProject.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/login")
public class LoginController {

    @RequestMapping (method = RequestMethod.GET)
    public String connection(Model model){

        model.addAttribute("user", new User());
        model.addAttribute("tabTitle", "Connexion");
        model.addAttribute("cssName", "form");

        return "integrated:formLogin";
    }
}