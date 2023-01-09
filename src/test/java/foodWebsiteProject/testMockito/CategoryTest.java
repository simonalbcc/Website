package foodWebsiteProject.testMockito;

import foodWebsiteProject.dataAccess.dao.CategoryDAO;
import foodWebsiteProject.dataAccess.entity.CategoryEntity;
import foodWebsiteProject.dataAccess.repository.CategoryRepository;
import foodWebsiteProject.dataAccess.util.ProviderConverter;
import foodWebsiteProject.model.Category;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;


import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest

public class CategoryTest {

    private CategoryDAO categoryDAO;

    @Mock
    private CategoryRepository categoryRepository;

    @Before
    public void setUp() {
        categoryDAO = new CategoryDAO(categoryRepository, new ProviderConverter());
    }

    @Test
    public void getAllCategory(){
        ArrayList<CategoryEntity> categoriesMocked = new ArrayList<>();
        categoriesMocked.add(new CategoryEntity(1));
        categoriesMocked.add(new CategoryEntity(2));
        categoriesMocked.add(new CategoryEntity(3));

        when(categoryRepository.findAll()).thenReturn(categoriesMocked);
        ArrayList<Category> idResults = new ArrayList<>();

        idResults.add(new Category(1));
        idResults.add(new Category(2));
        idResults.add(new Category(3));

        assertThat(categoryDAO.findAllCategories()).usingRecursiveComparison().isEqualTo(idResults);


    }

}
