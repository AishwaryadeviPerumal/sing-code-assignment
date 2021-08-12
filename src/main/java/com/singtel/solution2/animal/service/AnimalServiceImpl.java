package com.singtel.solution2.animal.service;

import com.singtel.solution2.animal.factory.AnimalFactory;
import com.singtel.solution2.animal.model.Animal;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class AnimalServiceImpl implements AnimalService {

    @Override
    public List<Animal> getAllAnimals() {
        log.info("get all animals service method started");
        try {
            return List.of(
                    AnimalFactory.getAnimal("BIRD"),
                    AnimalFactory.getAnimal("DUCK"),
                    AnimalFactory.getAnimal("CHICKEN"),
                    AnimalFactory.getAnimal("ROOSTER"),
                    AnimalFactory.getAnimal("PARROT"),
                    AnimalFactory.getAnimal("FISH"),
                    AnimalFactory.getAnimal("SHARK"),
                    AnimalFactory.getAnimal("CLOWNFISH"),
                    AnimalFactory.getAnimal("DOLPHIN"),
                    AnimalFactory.getAnimal("FROG"),
                    AnimalFactory.getAnimal("DOG"),
                    AnimalFactory.getAnimal("BUTTERFLY"),
                    AnimalFactory.getAnimal("CAT")
            );
        }catch(Exception e){
            log.info("exception in get all animal service method");
            throw e;
        }
    }
}
