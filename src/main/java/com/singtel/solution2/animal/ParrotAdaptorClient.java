package com.singtel.solution2.animal;

public class ParrotAdaptorClient {
    public static void main(String[] args){
        ParrotAdaptor parrotAdaptor =new ParrotAdaptorImpl();
        parrotAdaptor.getParrotLivingWithDog().sing();
        parrotAdaptor.getParrotLivingWithCat().sing();
        parrotAdaptor.getParrotLivingWithRooster().sing();
    }
}
