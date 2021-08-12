package com.singtel.solution2.animal.model;

public class SwimmingAnimal extends Animal implements Swimmable {
    @Override
    public void swim() {
            System.out.println("I can swim");
        }
}
