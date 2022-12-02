package foodWebsiteProject.controller;

import foodWebsiteProject.dataAccess.dao.CategoryDAO;
import foodWebsiteProject.dataAccess.dao.CategoryDataAccess;
import foodWebsiteProject.dataAccess.dao.TranslationDAO;
import foodWebsiteProject.dataAccess.dao.TranslationDataAccess;
import foodWebsiteProject.model.Category;
import foodWebsiteProject.model.Translation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

@Controller
@RequestMapping(value="/menu")
public class CategoryController {

    private TranslationDataAccess translationDAO;
    private CategoryDataAccess categoryDAO;

    @Autowired
    public CategoryController(TranslationDAO translationDAO, CategoryDAO categoryDAO) {
        this.translationDAO = translationDAO;
        this.categoryDAO = categoryDAO;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String home (Model model){

        ArrayList<Translation> translations = translationDAO.getAllCategories();
        ArrayList<Category> categories = categoryDAO.findAllCategories();

        model.addAttribute("tabTitle", "Menu");
        model.addAttribute("cssName", "category");
        model.addAttribute("translations", translations);
        model.addAttribute("categories", categories);

        return "integrated:category";
    }
}