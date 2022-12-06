package foodWebsiteProject.controller;

import foodWebsiteProject.dataAccess.dao.ProductDAO;
import foodWebsiteProject.dataAccess.dao.ProductDataAccess;
import foodWebsiteProject.dataAccess.dao.TranslationDAO;
import foodWebsiteProject.dataAccess.dao.TranslationDataAccess;
import foodWebsiteProject.model.Product;
import foodWebsiteProject.model.Translation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.stream.Collectors;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping(value="/products")
public class ProductController {
    private ProductDataAccess productDAO;
    private TranslationDataAccess translationDAO;
    @Autowired
    public ProductController(ProductDAO productDAO, TranslationDAO translationDAO){
        this.productDAO = productDAO;
        this.translationDAO = translationDAO;
    }

    @RequestMapping(value = "/{category}", method = RequestMethod.GET)
    public String getProducts (@PathVariable("category") Integer categoryId, Model model){

        List<Product> products = productDAO.getAllProductsByCategoryId(categoryId);
        String categoryChosen = translationDAO.getAllCategories().stream().filter(t -> t.getCategory().getId() == categoryId).toList().get(0).getCategoryName();
        String categoryChosenInFrench = translationDAO.getAllCategoriesWithAnId(2).stream().filter(t -> t.getCategory().getId() == categoryId).toList().get(0).getCategoryName();

        model.addAttribute("products", products);
        model.addAttribute("tabTitle", categoryChosen);
        model.addAttribute("cssName", "product");
        model.addAttribute("categoryChosen", categoryChosen);
        model.addAttribute("categoryChosenInFrench", categoryChosenInFrench);

        return "integrated:products";
    }
}