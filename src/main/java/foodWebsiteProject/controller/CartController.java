package foodWebsiteProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/cart")
public class CartController {

    @Autowired
    public CartController() {
    }

    @RequestMapping(method = RequestMethod.GET)
    public String home(Model model){

        model.addAttribute("tabTitle", "panier");

        return "integrated:cart";
    }
}
