package com.singtel.solution2.animal.model;

public class Frog extends SwimmingAnimal implements Singable {
    @Override
    public void sing() {
        System.out.println("I am singing");
    }
}
