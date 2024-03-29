package foodWebsiteProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/welcome")
public class WelcomeController {

    @Autowired
    public WelcomeController() {
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getHomePage (Model model){

        model.addAttribute("tabTitle", "Welcome");
        model.addAttribute("cssName", "welcome");

        return "integrated:welcome";
    }
}
