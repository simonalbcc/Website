package foodWebsiteProject.dataAccess.repository;

import foodWebsiteProject.dataAccess.entity.TranslationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TranslationRepository extends JpaRepository<TranslationEntity,Integer> {
}
