package foodWebsiteProject.controller;


import foodWebsiteProject.Constants;
import foodWebsiteProject.dataAccess.dao.*;
import foodWebsiteProject.model.LineOrder;
import foodWebsiteProject.model.Order;
import foodWebsiteProject.model.User;
import jdk.swing.interop.SwingInterOpUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "/payment")
@SessionAttributes({Constants.CURRENT_CART})
public class PaymentController {

    private OrderDataAccess orderDAO;
    private LineOrderDataAccess lineOrderDAO;
    @Autowired
    public PaymentController(OrderDAO orderDAO, LineOrderDAO lineOrderDAO){
        this.lineOrderDAO = lineOrderDAO;
        this.orderDAO = orderDAO;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getPaymentPage (Model model,
                                  @ModelAttribute(value = Constants.CURRENT_CART)HashMap<Integer, LineOrder> cart){

        Order order = new Order();
        order.setDate(new Date());
        order.setPaid(false);
        order.setUser((User)SecurityContextHolder.getContext().getAuthentication().getPrincipal());
        order = orderDAO.save(order);
        order.setUser((User)SecurityContextHolder.getContext().getAuthentication().getPrincipal());

        for(Map.Entry<Integer, LineOrder> product : cart.entrySet()){
            LineOrder lineOrder = product.getValue();
            lineOrder.setOrder(order);
            lineOrderDAO.save(lineOrder);
        }

        model.addAttribute("tabTitle","Page de paiement");

        return "integrated:payment";
    }

}
