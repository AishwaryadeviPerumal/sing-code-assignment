package com.singtel.solution2.animal.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Fish extends SwimmingAnimal {
    public enum SIZE { SMALL, LARGE};
    public enum COLOR {ORANGE, GREY};

    protected SIZE size;
    protected COLOR color;
}
