package foodWebsiteProject.controller;

import foodWebsiteProject.dataAccess.dao.ProductDAO;
import foodWebsiteProject.dataAccess.dao.ProductDataAccess;
import foodWebsiteProject.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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

    @RequestMapping(value = "/{category}", method = RequestMethod.GET)
    public String getProducts (@PathVariable("category") Integer categoryId, Model model){
        List<Product> products = productDAO.getAllProductsByCategoryId(categoryId);

        model.addAttribute("products", products);
        model.addAttribute("title", "Produits");
        return "integrated:products";
    }
}