package com.singtel.solution2.animal;

public class BirdsFactory {

    public static Bird createBird(String type, Animal.Sex sex){
        switch (type){
            case "Chicken": return new Chicken(sex);
            case "Duck": return new Duck();
            default: return new Bird();
        }
    }
}
