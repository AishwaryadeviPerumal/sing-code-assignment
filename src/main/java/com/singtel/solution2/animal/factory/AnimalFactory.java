package com.singtel.solution2.animal.factory;

import com.singtel.solution2.animal.model.*;

public class AnimalFactory {

    public static Animal getAnimal(String type){
        switch (type){
            case "BIRD": return new Bird();
            case "DUCK": return new Duck();
            case "CHICKEN": return new Chicken();
            case "ROOSTER": return new Chicken(Animal.Sex.MALE);
            case "PARROT": return new Parrot();
            case "FISH": return new Fish();
            case "SHARK": return new SharkFish(new Fish());
            case "CLOWNFISH": return new ClownFish(new Fish());
            case "DOLPHIN": return new Dolphin();
            case "FROG": return new Frog();
            case "DOG": return new Dog();
            case "BUTTERFLY": return new Butterfly();
            case "CAT": return new Cat();
            default: return null;
        }
    }
}
