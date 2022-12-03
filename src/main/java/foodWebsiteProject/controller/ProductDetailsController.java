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
        Product productChosen = productDAO.getProductById(idProduct);
        String categoryChosenInFrench = translationDAO.getAllCategories(2).stream().filter(t -> t.getCategory().getId() == productChosen.getCategory()).toList().get(0).getCategoryName();

        model.addAttribute("tabTitle", productChosen.getName());
        model.addAttribute("cssName", "details");
        model.addAttribute("product", productChosen);
        model.addAttribute("categoryChosenInFrench", categoryChosenInFrench);

        return "integrated:productDetails";
    }
}