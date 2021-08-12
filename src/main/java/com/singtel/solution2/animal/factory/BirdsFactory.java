package com.singtel.solution2.animal.factory;

import com.singtel.solution2.animal.model.Animal;
import com.singtel.solution2.animal.model.Bird;
import com.singtel.solution2.animal.model.Chicken;
import com.singtel.solution2.animal.model.Duck;

public class BirdsFactory {

    public static Bird createBird(String type, Animal.Sex sex){
        switch (type){
            case "Chicken": return new Chicken(sex);
            case "Duck": return new Duck();
            default: return new Bird();
        }
    }
}
