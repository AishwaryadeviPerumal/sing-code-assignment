package com.singtel.solution1.animal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BirdTest {

    @InjectMocks
    Bird bird;

    @Test
    public void singTest(){
        bird.sing();
    }

}
