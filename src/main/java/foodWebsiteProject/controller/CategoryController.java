package foodWebsiteProject.controller;

import foodWebsiteProject.dataAccess.dao.TranslationDAO;
import foodWebsiteProject.dataAccess.dao.TranslationDataAccess;
import foodWebsiteProject.model.Translation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.stream.Collectors;

@Controller
@RequestMapping(value="/menu")
public class CategoryController {

    private TranslationDataAccess translationDAO;
    @Autowired
    public CategoryController(TranslationDAO translationDAO) {
        this.translationDAO = translationDAO;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String home (Model model){

        ArrayList<Translation> categories = translationDAO.getAllCategories();
       // String categoryChosen =  categories.stream().map(Translation::getName).collect(Collectors.toCollection(ArrayList :: new)).get(0);

        model.addAttribute("tabTitle", "Menu");
        model.addAttribute("cssName", "category");
        model.addAttribute("categories", categories);

        return "integrated:category";
    }
}