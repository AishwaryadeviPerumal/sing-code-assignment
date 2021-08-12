package com.singtel.solution2.animal.model.response;

import com.singtel.solution2.animal.model.Animal;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Response {
    private MetaInfo metaInfo;
    private List<Animal> data;
}
