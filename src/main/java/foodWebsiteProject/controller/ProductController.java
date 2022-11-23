package foodWebsiteProject.controller;

import foodWebsiteProject.dataAccess.dao.ProductDAO;
import foodWebsiteProject.dataAccess.dao.ProductDataAccess;
import foodWebsiteProject.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;


@Controller
@RequestMapping(value="/products")
public class ProductController {
    private ProductDataAccess productDAO;
    @Autowired
    public ProductController(ProductDAO productDAO){
        this.productDAO = productDAO;
    }
    @RequestMapping(method = RequestMethod.GET)
    public String home (Model model){
        List<Product> products = productDAO.getAllFromCategory(1);
        model.addAttribute("products", products);
        model.addAttribute("title", "Produits");
        return "integrated:productDisplay";
    }
}