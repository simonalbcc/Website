package foodWebsiteProject.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/payment")
public class PaymentController {

    @Autowired
    public PaymentController(){
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getPaymentPage (){
        return "integrated:payment";
    }

}
