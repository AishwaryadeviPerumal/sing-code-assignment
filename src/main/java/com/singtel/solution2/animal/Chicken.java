package com.singtel.solution2.animal;

public class Chicken extends Bird {
    public Chicken(){

    }
    public Chicken(Sex sex){
        this.sex=sex;
    }

    @Override
    public void sing() {
        switch (sex) {
            case MALE: {
                        System.out.println("Cock-a-doodle-doo");
                        break;
                        }
            default:   System.out.println("Cluck, cluck");
        }
    }
}
