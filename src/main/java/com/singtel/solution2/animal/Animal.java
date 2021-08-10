package com.singtel.solution2.animal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Animal {
    String sound;
    Sex sex;
    public enum Sex {
        MALE, FEMALE
    }
}
