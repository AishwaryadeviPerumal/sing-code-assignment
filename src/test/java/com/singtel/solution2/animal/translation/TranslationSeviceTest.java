package com.singtel.solution2.animal.translation;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TranslationSeviceTest {

    @InjectMocks
    TranslatorService translatorService;

    @Test
    public void getSoundTranslationsTest_lang_available(){
        String content=translatorService.getSoundTranslations("rooster","Tamil");
        Assert.assertEquals("koka ra ko ko oo",content);
    }
    @Test
    public void getSoundTranslationsTest_lang_not_available(){
        String content=translatorService.getSoundTranslations("rooster","someOtherLang");
        Assert.assertEquals("Cock-a-doodle-doo",content);
    }
    @Test
    public void getSoundTranslationsTest_animal_type_not_available(){
        String content=translatorService.getSoundTranslations("someOtherAnimal","Tamil");
        Assert.assertNull(content);
    }
}
