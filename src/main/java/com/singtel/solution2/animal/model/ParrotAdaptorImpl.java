package com.singtel.solution2.animal.model;

import lombok.Getter;

@Getter
public class ParrotAdaptorImpl implements ParrotAdaptor {
    private Parrot parrot =new Parrot(); //using composition for adaptor pattern

    @Override
    public Parrot getParrotLivingWithDog() {
        Parrot parrotObj= getParrot();
        parrotObj.setSound("Woof, woof");
        return parrotObj;
    }

    @Override
    public Parrot getParrotLivingWithCat() {
        Parrot parrotObj= getParrot();
        parrotObj.setSound("Me ow");
        return parrotObj;
    }

    @Override
    public Parrot getParrotLivingWithRooster() {
        Parrot parrotObj= getParrot();
        parrotObj.setSound("Cock-a-doodle-doo");
        return parrotObj;
    }
}
