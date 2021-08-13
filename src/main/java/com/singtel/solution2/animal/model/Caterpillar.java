package com.singtel.solution2.animal.model;

public class Caterpillar extends Insect implements Walkable {
    @Override
    public void walk() {
        System.out.println("Caterpillar can walk");
    }
}
