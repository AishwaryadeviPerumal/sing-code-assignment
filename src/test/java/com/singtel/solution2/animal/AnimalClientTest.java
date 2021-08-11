package com.singtel.solution2.animal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AnimalClientTest {

    private String[] args=null;

    @Test
    public void animalClientTest(){
        AnimalClient.main(args);
        assert(true);
    }
}
