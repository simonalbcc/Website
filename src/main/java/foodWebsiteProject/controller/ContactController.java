package foodWebsiteProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/contact")
public class ContactController {

    @Autowired
    public ContactController() {
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getContactPage (Model model){

        model.addAttribute("tabTitle", "Contact");
        model.addAttribute("cssName", "contact");

        return "integrated:contact";
    }

}
