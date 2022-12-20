package foodWebsiteProject.testMockito;

import foodWebsiteProject.dataAccess.dao.ProductDAO;
import foodWebsiteProject.dataAccess.entity.CategoryEntity;
import foodWebsiteProject.dataAccess.entity.ProductEntity;
import foodWebsiteProject.dataAccess.repository.ProductRepository;
import foodWebsiteProject.dataAccess.util.ProviderConverter;
import foodWebsiteProject.model.Category;
import foodWebsiteProject.model.Product;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class ProductTest {

    private ProductDAO productDAO;

    @Mock
    private ProductRepository productRepository;

    @Before
    public void setUp(){
        productDAO = new ProductDAO(productRepository,new ProviderConverter());
    }

    @Test
    public void getProductById(){
        ProductEntity productEntityMocked = new ProductEntity(1, "Dagobert", "L", 4.5, "Jambon, mayonnaise, gouda, tomate, salade, oeuf", new CategoryEntity(2));
        when(productRepository.findProductEntityById(1)).thenReturn(productEntityMocked);
        Product product = new Product(1, "Dagobert", "L", 4.5, "Jambon, mayonnaise, gouda, tomate, salade, oeuf", new Category(2));
        assertThat(productDAO.getProductById(1)).isEqualTo(product);
    }
}
