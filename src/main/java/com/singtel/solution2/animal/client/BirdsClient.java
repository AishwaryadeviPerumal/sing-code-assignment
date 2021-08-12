package com.singtel.solution2.animal.client;

import com.singtel.solution2.animal.model.Animal;
import com.singtel.solution2.animal.model.Bird;
import com.singtel.solution2.animal.factory.BirdsFactory;

public class BirdsClient {
    public static void main(String[] args){
        Bird chicken= BirdsFactory.createBird("Chicken", Animal.Sex.FEMALE);
        Bird roosterChicken=BirdsFactory.createBird("Chicken", Animal.Sex.MALE);
        chicken.sing();
        roosterChicken.sing();
    }
}
