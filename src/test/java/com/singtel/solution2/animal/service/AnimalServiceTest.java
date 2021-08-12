package com.singtel.solution2.animal.service;

import com.singtel.solution2.animal.model.Animal;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class AnimalServiceTest {

    @InjectMocks
    AnimalServiceImpl animalService;

    @Test
    public void getAllAnimalsTest_happy_flow(){
        List<Animal> animals=animalService.getAllAnimals();
        Assert.assertTrue(animals!=null && animals.size()==13);
    }
    //no exception flow to test for now.
}
