package com.singtel.solution2.animal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Fish extends SwimmingAnimal {
    public enum SIZE { SMALL, LARGE};
    public enum COLOR {ORANGE, GREY};

    protected SIZE size;
    protected COLOR color;
}
