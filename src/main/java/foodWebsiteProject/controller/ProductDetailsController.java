package foodWebsiteProject.controller;

import foodWebsiteProject.dataAccess.dao.ProductDAO;
import foodWebsiteProject.dataAccess.dao.ProductDataAccess;
import foodWebsiteProject.dataAccess.dao.TranslationDAO;
import foodWebsiteProject.dataAccess.dao.TranslationDataAccess;
import foodWebsiteProject.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@Controller
@RequestMapping(value="/detailsProduct")
public class ProductDetailsController {
    private ProductDataAccess productDAO;
    private TranslationDataAccess translationDAO;
    @Autowired
    public ProductDetailsController(ProductDAO productDAO, TranslationDAO translationDAO){
        this.productDAO = productDAO;
        this.translationDAO = translationDAO;
    }

    @RequestMapping(value = "/{idProduct}", method = RequestMethod.GET)
    public String details (@PathVariable("idProduct") Integer idProduct, Model model){


        model.addAttribute("products", "product");
        model.addAttribute("tabTitle", "Détails produit");
        model.addAttribute("cssName", "details");

        return "integrated:productDetails";
    }
}