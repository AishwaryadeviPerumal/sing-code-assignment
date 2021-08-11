package com.singtel.solution2.animal;

public class Caterpillar extends Animal implements Walkable {
    @Override
    public void walk() {
        System.out.println("Caterpillar can walk");
    }
}
