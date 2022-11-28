package foodWebsiteProject.dataAccess.repository;

import foodWebsiteProject.dataAccess.entity.LanguageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageRepository extends JpaRepository<LanguageEntity,String> {
}
