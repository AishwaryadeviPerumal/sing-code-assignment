package com.singtel.solution2.animal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Animal {
    protected String sound;
    protected Sex sex;
    public enum Sex {
        MALE, FEMALE
    }
}
