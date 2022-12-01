package foodWebsiteProject.dataAccess.dao;

import foodWebsiteProject.dataAccess.entity.ProductEntity;
import foodWebsiteProject.dataAccess.repository.CategoryRepository;
import foodWebsiteProject.dataAccess.util.ProviderConverter;
import foodWebsiteProject.model.Product;
import foodWebsiteProject.model.Translation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
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
}
