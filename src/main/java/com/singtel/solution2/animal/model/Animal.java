package com.singtel.solution2.animal.model;

import com.singtel.solution2.animal.service.TranslatorService;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Animal {
    protected String sound;
    protected Sex sex;
    protected TranslatorService translatorService;
    public enum Sex {
        MALE, FEMALE
    }
}
