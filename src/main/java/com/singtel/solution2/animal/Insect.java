package com.singtel.solution2.animal;

public class Insect extends Animal implements Flyable {
    @Override
    public void fly() {
        System.out.println("Insects can fly");
    }
}
