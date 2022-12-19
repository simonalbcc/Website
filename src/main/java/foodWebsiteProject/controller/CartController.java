package foodWebsiteProject.controller;

import foodWebsiteProject.Constants;
import foodWebsiteProject.dataAccess.dao.ProductDAO;
import foodWebsiteProject.dataAccess.dao.ProductDataAccess;
import foodWebsiteProject.dataAccess.dao.TranslationDAO;
import foodWebsiteProject.dataAccess.dao.TranslationDataAccess;
import foodWebsiteProject.model.LineOrder;
import foodWebsiteProject.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

@Controller
@RequestMapping(value="/cart")
@SessionAttributes({Constants.CURRENT_CART})
public class CartController {
    private ProductDataAccess productDAO;
    private TranslationDataAccess translationDAO;

    @ModelAttribute(Constants.CURRENT_CART)
    public HashMap<Integer, LineOrder> cart(){
        return new HashMap<>();
    }
    @Autowired
    public CartController(ProductDAO productDAO, TranslationDAO translationDAO) {
        this.productDAO = productDAO;
        this.translationDAO = translationDAO;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getCart(Model model,
                          @ModelAttribute(value= Constants.CURRENT_CART) HashMap<Integer, LineOrder> cart,
                          final BindingResult errors){

        ArrayList<String> categoriesChosenInFrench = translationDAO.getAllCategoriesWithAnId(2).stream().map(t->t.getCategoryName()).collect(Collectors.toCollection(ArrayList :: new));
        Double totalPrice = cart.values().stream().mapToDouble(p -> p.getRealPrice() * p.getQuantity()).sum();

        model.addAttribute("tabTitle", "Card");
        model.addAttribute("cssName", "cart");
        model.addAttribute("cart", cart);
        model.addAttribute("lineOrder", new LineOrder());
        model.addAttribute("categoriesChosenInFrench", categoriesChosenInFrench);
        model.addAttribute("totalPrice", totalPrice);
        return "integrated:cart";
    }

    @RequestMapping(value="/add/{idProduct}", method = RequestMethod.POST)
    public String addProduct(Model model,
                             @ModelAttribute(value= Constants.CURRENT_CART)HashMap<Integer, LineOrder> cart,
                             @PathVariable("idProduct") Integer idProduct,
                             @Valid @ModelAttribute("lineOrder") LineOrder lineOrder,
                             final BindingResult errors){
        if(!errors.hasErrors()){
            if(cart.containsKey(idProduct)){
                cart.get(idProduct).setQuantity(cart.get(idProduct).getQuantity() + lineOrder.getQuantity());

            } else {
                Product product = productDAO.getProductById(idProduct);
                lineOrder.setProduct(product);
                lineOrder.setRealPrice(product.getPriceCatalog());
                cart.put(idProduct, lineOrder);
            }
            return "redirect:/products/" + cart.get(idProduct).getProduct().getCategory().getId();
        }
        return "redirect:/detailsProduct/" + idProduct;
    }

    @RequestMapping(value="/update/{idProduct}", method = RequestMethod.POST)
    public String updateQuantity(Model model,
                                 @ModelAttribute(value= Constants.CURRENT_CART)HashMap<Integer, LineOrder> cart,
                                 @PathVariable("idProduct") Integer idProduct,
                                 @ModelAttribute("lineOrder") LineOrder lineOrder,
                                 final BindingResult errors){
        if(!errors.hasErrors()){
            if(lineOrder.getQuantity() > 0){
                cart.get(idProduct).setQuantity(lineOrder.getQuantity());
            } else {
                cart.remove(idProduct);
            }
        }
        return "redirect:/cart";
    }

    @RequestMapping(value="/delete/{idProduct}", method = RequestMethod.POST)
    public String deleteProduct(Model model,
                                @ModelAttribute(value= Constants.CURRENT_CART)HashMap<Integer, LineOrder> cart,
                                @PathVariable("idProduct") Integer idProduct,
                                @ModelAttribute("lineOrder") LineOrder lineOrder,
                                final BindingResult errors){
        if(!errors.hasErrors()){
            cart.remove(idProduct);
        }
        return "redirect:/cart";
    }
}
