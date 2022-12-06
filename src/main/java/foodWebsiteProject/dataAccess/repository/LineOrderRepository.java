package foodWebsiteProject.dataAccess.repository;

import foodWebsiteProject.dataAccess.entity.LineOrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LineOrderRepository extends JpaRepository<LineOrderEntity,Integer> {
}
