package com.singtel.solution2.animal.model;

public class SharkFish extends FishDecorator{

    public SharkFish(Fish fish){
        super(fish);
        size=SIZE.LARGE;
        color=COLOR.GREY;
    }
    public void eat(){
        System.out.println("Shark fish can eat other fishes");
    }
}
