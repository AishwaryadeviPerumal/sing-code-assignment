package com.singtel.solution2.animal.service;

import java.util.HashMap;
import java.util.Map;

public class Translations {
    public static Map<String,Map<String,String>> soundTransMap= new HashMap<>();
    static{
        soundTransMap.put("rooster",getRoosterSoundTranslations());
    }

    public static Map<String,String> getRoosterSoundTranslations(){
        Map<String,String> roosterTransMap= new HashMap<>();

        roosterTransMap.put("Danish","kykyliky");
        roosterTransMap.put("Dutch","kukeleku");
        roosterTransMap.put("Finnish","kukko kiekuu");
        roosterTransMap.put("French","cocorico");
        roosterTransMap.put("German","kikeriki");
        roosterTransMap.put("Greek","kikiriki");
        roosterTransMap.put("Hebrew","coo- koo - ri-koo");
        roosterTransMap.put("Hungarian","kukuriku");
        roosterTransMap.put("Italian","chicchirichi");
        roosterTransMap.put("Japanese","ko - ke - kok - ko -o");
        roosterTransMap.put("Portuguese","cucurucu");
        roosterTransMap.put("Russian","kukareku");
        roosterTransMap.put("Swedish","kuckeliku");
        roosterTransMap.put("Turkish","kuk-kurri-kuuu");
        roosterTransMap.put("Urdu","kuklooku");
        roosterTransMap.put("Tamil","koka ra ko ko oo");
        roosterTransMap.put("English","Cock-a-doodle-doo");
        return roosterTransMap;
    }
}
