package com.singtel.solution2.animal.client;

import com.singtel.solution2.animal.model.ParrotAdaptor;
import com.singtel.solution2.animal.model.ParrotAdaptorImpl;

public class ParrotAdaptorClient {
    public static void main(String[] args){
        ParrotAdaptor parrotAdaptor =new ParrotAdaptorImpl();
        parrotAdaptor.getParrotLivingWithDog().sing();
        parrotAdaptor.getParrotLivingWithCat().sing();
        parrotAdaptor.getParrotLivingWithRooster().sing();
    }
}
