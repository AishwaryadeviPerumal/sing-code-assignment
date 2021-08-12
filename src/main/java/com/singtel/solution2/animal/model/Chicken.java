package com.singtel.solution2.animal.model;

public class Chicken extends Bird {
    public Chicken(){

    }
    public Chicken(Sex sex){
        this.sex=sex;
    }

    @Override
    public void sing() {
        switch (sex) {
            case MALE: {
                        System.out.println("Cock-a-doodle-doo");
                        break;
                        }
            default:   System.out.println("Cluck, cluck");
        }
    }

    public void sing(String lang) {
        switch (sex) {
            case MALE: {
                String sound=translatorService.getSoundTranslations("rooster",lang);
                System.out.println(sound);
                break;
            }
            default:   System.out.println("Cluck, cluck");
        }
    }
}
