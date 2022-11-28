package foodWebsiteProject.dataAccess.repository;

import foodWebsiteProject.dataAccess.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity,Integer> {
    ArrayList<ProductEntity> findProductEntitiesByCategoryEntityId (Integer id);

}
