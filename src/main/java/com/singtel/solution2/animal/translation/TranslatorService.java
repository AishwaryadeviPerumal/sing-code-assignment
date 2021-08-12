package com.singtel.solution2.animal.translation;

public class TranslatorService {

    public String getSoundTranslations(String animalType, String lang){
        if(Translations.soundTransMap.containsKey(animalType)) {
            if(!Translations.soundTransMap.get(animalType).containsKey(lang)) {
                System.out.println(lang + " translations not available for "+animalType+", so falling back to default language English");
                lang = "English";
            }
            return Translations.soundTransMap.get(animalType).get(lang);
        }else{
            System.out.println(animalType + " animal translations not available");
            return null;
        }
    }
}
