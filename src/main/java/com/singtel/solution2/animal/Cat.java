package com.singtel.solution2.animal;

public class Cat extends Animal implements Walkable,Singable {
    @Override
    public void sing() {
        System.out.println("I am singing");
    }

    @Override
    public void walk() {
        System.out.println("I am walking");
    }
}
