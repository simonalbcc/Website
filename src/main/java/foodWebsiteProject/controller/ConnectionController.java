package foodWebsiteProject.controller;

import foodWebsiteProject.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/connection")
public class ConnectionController {

    @RequestMapping (method = RequestMethod.GET)
    public String connection(Model model){
        model.addAttribute("user", new User());
        return "integrated:formConnection";
    }
}