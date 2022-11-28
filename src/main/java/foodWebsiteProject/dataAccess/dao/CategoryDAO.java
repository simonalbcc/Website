package foodWebsiteProject.dataAccess.dao;

import foodWebsiteProject.dataAccess.repository.CategoryRepository;
import foodWebsiteProject.dataAccess.util.ProviderConverter;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@Transactional
@Service
public class CategoryDAO implements CategoryDataAccess {
    private CategoryRepository categoryRepository;
    private ProviderConverter categoryConverter;

    public CategoryDAO(CategoryRepository categoryRepository, ProviderConverter categoryConverter) {
        this.categoryRepository = categoryRepository;
        this.categoryConverter = categoryConverter;
    }
}
