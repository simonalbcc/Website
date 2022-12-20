package foodWebsiteProject.dataAccess.dao;

import foodWebsiteProject.dataAccess.repository.CategoryRepository;
import foodWebsiteProject.dataAccess.util.ProviderConverter;
import foodWebsiteProject.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.stream.Collectors;

@Transactional
@Service
public class CategoryDAO implements CategoryDataAccess {
    private CategoryRepository categoryRepository;
    private ProviderConverter categoryConverter;

    @Autowired
    public CategoryDAO(CategoryRepository categoryRepository, ProviderConverter categoryConverter) {
        this.categoryRepository = categoryRepository;
        this.categoryConverter = categoryConverter;
    }

    public ArrayList<Category> findAllCategories(){
        return categoryRepository.findAll()
                .stream().map(categoryEntity -> categoryConverter.categoryEntityToCategoryModel(categoryEntity))
                .collect(Collectors.toCollection(ArrayList :: new));

    }

}
