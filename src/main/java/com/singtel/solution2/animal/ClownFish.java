package com.singtel.solution2.animal;

public class ClownFish extends FishDecorator {

    public ClownFish(Fish fish){
        super(fish);
        size=SIZE.SMALL;
        color=COLOR.ORANGE;
    }

    public void makeJokes(){
        System.out.println("Clown fish can make jokes");
    }
}
