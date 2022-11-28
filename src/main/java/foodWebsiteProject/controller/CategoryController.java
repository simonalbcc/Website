package foodWebsiteProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/menu")
public class CategoryController {

    @RequestMapping(method = RequestMethod.GET)
    public String home (Model model){
        model.addAttribute("title", "Menu");
        return "integrated:menu";
    }

}