package com.singtel.solution2.animal;

public class BirdsClient {
    public static void main(String[] args){
        Bird chicken=BirdsFactory.createBird("Chicken", Animal.Sex.FEMALE);
        Bird roosterChicken=BirdsFactory.createBird("Chicken", Animal.Sex.MALE);
        chicken.sing();
        roosterChicken.sing();
    }
}
