package foodWebsiteProject.controller;


import foodWebsiteProject.Constants;
import foodWebsiteProject.dataAccess.dao.*;
import foodWebsiteProject.model.LineOrder;
import foodWebsiteProject.model.Order;
import foodWebsiteProject.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.*;

@Controller
@RequestMapping(value = "/payment")
@SessionAttributes({Constants.CURRENT_CART})
public class PaymentController {

    private OrderDataAccess orderDAO;
    private LineOrderDataAccess lineOrderDAO;

    private UserDataAccess userDAO;
    @Autowired
    public PaymentController(OrderDAO orderDAO, LineOrderDAO lineOrderDAO, UserDAO userDAO){
        this.lineOrderDAO = lineOrderDAO;
        this.orderDAO = orderDAO;
        this.userDAO = userDAO;
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


        List<LineOrder> orderProductPrice = new ArrayList<>(cart.values());
        Collections.sort(orderProductPrice, Comparator.comparing(LineOrder::getRealPrice));

        int nbPoints = order.getUser().getFidelityCard();
        for(Map.Entry<Integer, LineOrder> product : cart.entrySet()){
            LineOrder lineOrder = product.getValue();
            lineOrder.setOrder(order);
            lineOrderDAO.save(lineOrder);
            nbPoints += lineOrder.getQuantity();
        }

        int nbProduitsPromo = nbPoints / 11; //TODO constante
        double priceProm = 0;
        for(int iProd = 0; iProd < nbProduitsPromo && nbProduitsPromo < orderProductPrice.size(); iProd++){
            priceProm += orderProductPrice.get(iProd).getRealPrice();
        }

        nbPoints -= nbProduitsPromo * 10;
        order.getUser().setFidelityCard(nbPoints);
        userDAO.save(order.getUser());

        model.addAttribute("tabTitle","Page de paiement");
        model.addAttribute("cssName", "payment");
        model.addAttribute("nbPoints",nbPoints);
        model.addAttribute("priceProm", priceProm);
        model.addAttribute("cart", cart);
        model.addAttribute("user", userDAO);


        return "integrated:payment";
    }

}
