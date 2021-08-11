package com.singtel.solution2.animal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FishDecorator extends Fish {
    protected Fish fish;
    public FishDecorator(Fish fish){
        this.fish=fish;
    }
}
