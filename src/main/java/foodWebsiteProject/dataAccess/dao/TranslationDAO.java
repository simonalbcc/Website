package foodWebsiteProject.dataAccess.dao;

import foodWebsiteProject.dataAccess.repository.TranslationRepository;
import foodWebsiteProject.dataAccess.util.ProviderConverter;
import foodWebsiteProject.dataAccess.util.Utils;
import foodWebsiteProject.model.Language;
import foodWebsiteProject.model.Translation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.stream.Collectors;

@Transactional
@Service
public class TranslationDAO implements TranslationDataAccess{
    private TranslationRepository translationRepository;
    private ProviderConverter translationConverter;

    @Autowired
    public TranslationDAO(TranslationRepository translationRepository, ProviderConverter translationConverter) {
        this.translationRepository = translationRepository;
        this.translationConverter = translationConverter;
    }

    public ArrayList<Translation> getAllCategories(Integer id) {
        return translationRepository.findTranslationEntitiesByLanguageId(id)
                .stream().map(translationEntity -> translationConverter.translationEntityToTranslationModel(translationEntity))
                .collect(Collectors.toCollection(ArrayList :: new));
    }
    public ArrayList<Translation> getAllCategories() {
        return getAllCategories(Utils.getIdLanguage());
    }

}
