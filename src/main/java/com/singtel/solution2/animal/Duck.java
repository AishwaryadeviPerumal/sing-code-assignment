package com.singtel.solution2.animal;

public class Duck extends Bird implements Swimmable {
    @Override
    public void sing() {
        System.out.println("Quack , quack");
    }

    @Override
    public void swim() {
        System.out.println("I can swim");
    }
}
