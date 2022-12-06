package foodWebsiteProject.controller;

import foodWebsiteProject.Constants;
import foodWebsiteProject.dataAccess.dao.ProductDAO;
import foodWebsiteProject.dataAccess.dao.ProductDataAccess;
import foodWebsiteProject.dataAccess.dao.TranslationDAO;
import foodWebsiteProject.dataAccess.dao.TranslationDataAccess;
import foodWebsiteProject.model.LineOrder;
import foodWebsiteProject.model.Order;
import foodWebsiteProject.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
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

    // afficher le panier
    @RequestMapping(method = RequestMethod.GET)
    public String getCart(Model model,
                          @ModelAttribute(value= Constants.CURRENT_CART) HashMap<Integer, LineOrder> cart,
                          final BindingResult errors){

        ArrayList<Integer> categoriesInCart = cart.values().stream().map(v -> v.getProduct().getCategory().getId()).collect(Collectors.toCollection(ArrayList :: new));
        ArrayList<String> categoriesChosenInFrench = translationDAO.getAllCategoriesWithAnId(2).stream().filter(t -> categoriesInCart.contains(t.getCategory().getId())).map(t->t.getCategoryName()).collect(Collectors.toCollection(ArrayList :: new));
        System.out.println(categoriesChosenInFrench);
        model.addAttribute("tabTitle", "Panier");
        model.addAttribute("cssName", "cart");
        model.addAttribute("cart", cart);
        model.addAttribute("lineOrder", new LineOrder());
        model.addAttribute("categoriesChosenInFrench", categoriesChosenInFrench);

        return "integrated:cart";
    }

    // ajout dans le panier
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
            System.out.println("Produit : " + cart.get(idProduct).getProduct().getName());
            System.out.println("Quantité : " + cart.get(idProduct).getQuantity());
            System.out.println("taille hashmap : " + cart.size());
            return "redirect:/menu";
        }
        return "redirect:/category";
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
            return "redirect:/cart";
        }
        return "redirect:/welcome";
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
