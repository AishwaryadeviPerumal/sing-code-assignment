package com.singtel.solution2.animal.client;

import com.singtel.solution2.animal.model.*;

public class FishClient {
    public static void main(String[] args){
        Fish sharkFish =new SharkFish(new Fish());
        Fish clownFish = new ClownFish(new Fish());

        System.out.println("shark fish size:"+sharkFish.getSize());
        System.out.println("shark fish color:"+sharkFish.getColor());
        System.out.println("clown fish size:"+clownFish.getSize());
        System.out.println("clown fish color:"+clownFish.getColor());
        ((SharkFish)sharkFish).eat();
        ((ClownFish)clownFish).makeJokes();

        SwimmingAnimal dolphin =new Dolphin();
        dolphin.swim();
    }
}
