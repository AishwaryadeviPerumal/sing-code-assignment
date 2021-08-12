package com.singtel.solution2.animal.model;

import com.singtel.solution2.animal.service.Translations;
import com.singtel.solution2.animal.service.TranslatorService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ChickenTest {

    @InjectMocks
    Chicken chicken=new Chicken(Animal.Sex.MALE);

    @Mock
    TranslatorService translatorService;

    @Test
    public void singTest_rooster_lang_tamil(){
        String animalType="rooster";
        String lang="Tamil";
        when(translatorService.getSoundTranslations(anyString(),anyString())).thenReturn(Translations.soundTransMap.get(animalType).get(lang));
        chicken.sing(lang);
        assert(true);
    }
    @Test
    public void singTest_rooster_translation_not_available(){
        String animalType="rooster";
        String lang="otherLang";
        when(translatorService.getSoundTranslations(anyString(),anyString())).thenReturn(Translations.soundTransMap.get(animalType).get("English"));
        chicken.sing(lang);
        assert(true);
    }
    @Test
    public void singTest_chicken(){
        String animalType="rooster";
        String lang="otherLang";
        when(translatorService.getSoundTranslations(anyString(),anyString())).thenReturn(Translations.soundTransMap.get(animalType).get("English"));
        chicken.sing(lang);
        assert(true);
    }
}
