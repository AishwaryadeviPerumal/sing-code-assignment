package com.singtel.solution2.animal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FishClientTest {

    private String[] args=null;

    @Test
    public void fishClientTest(){
        FishClient.main(args);
        assert(true);
    }
}
