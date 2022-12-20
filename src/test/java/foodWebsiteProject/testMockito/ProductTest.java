package foodWebsiteProject.testMockito;


import foodWebsiteProject.dataAccess.dao.ProductDAO;
import foodWebsiteProject.dataAccess.entity.ProductEntity;
import foodWebsiteProject.dataAccess.repository.ProductRepository;
import foodWebsiteProject.dataAccess.util.ProviderConverter;
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

    @Mock
    private ProviderConverter providerConverter;

    @Before
    public void setUp() throws Exception{
        productDAO = new ProductDAO(productRepository,providerConverter);
    }

    @Test
    public void testProductTest(){
        ProductEntity productEntityMocked = new ProductEntity(1);

        when(productRepository.findProductEntityById(1)).thenReturn(productEntityMocked);

        Product result = new Product(1);

        assertThat(productDAO.getProductById(1)).isEqualTo(result);
    }
}
