package com.singtel.solution2.animal.model;

public class Butterfly extends Insect implements Flyable{
    @Override
    public void fly() {
        System.out.println("Butterfly can fly");
    }
}
