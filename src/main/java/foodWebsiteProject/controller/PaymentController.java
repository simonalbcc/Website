package foodWebsiteProject.controller;


import foodWebsiteProject.Constants;
import foodWebsiteProject.model.LineOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.HashMap;

@Controller
@RequestMapping(value = "/payment")
@SessionAttributes({Constants.CURRENT_CART})
public class PaymentController {

    @Autowired
    public PaymentController(){
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getPaymentPage (Model model,
                                  @ModelAttribute(value = Constants.CURRENT_CART)HashMap<Integer, LineOrder> cart){


        model.addAttribute("tabTitle","Page de paiement");

        return "integrated:payment";
    }

}
