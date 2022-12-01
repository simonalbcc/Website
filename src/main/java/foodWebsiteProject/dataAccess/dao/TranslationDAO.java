package foodWebsiteProject.dataAccess.dao;

import foodWebsiteProject.dataAccess.repository.TranslationRepository;
import foodWebsiteProject.dataAccess.util.ProviderConverter;
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

    public ArrayList<Translation> getAllCategories() {
        int idLanguage;
        switch (LocaleContextHolder.getLocale().getLanguage()){
            case "en":
                idLanguage = 1; break;
            case "fr":
                idLanguage = 2; break;
            default:
                idLanguage = 0; break;
        }

        return translationRepository.findTranslationEntitiesByLanguageId(idLanguage)
                .stream().map(translationEntity -> translationConverter.translationEntityToTranslationModel(translationEntity))
                .collect(Collectors.toCollection(ArrayList :: new));
    }
}
